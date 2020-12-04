package stringExcersize;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String generatedQuery = generateQuery();
		
		while(generatedQuery == "") {
			generatedQuery = generateQuery();
		}
		
		QueryParser qp = new QueryParser(generatedQuery);
			
		System.out.println("Query, line by line:");
		for(String line: qp.getSplitQuery()) {
			System.out.println(line);
		}
		
		System.out.println("\nMain Query: " + qp.getMainQuery());
		System.out.println("\nCondition: " + qp.getCondition());
		System.out.println("\nOrder by: " + qp.getOrderByCondition());
		System.out.println("\nGroup by: " + qp.getGroupByCondition());
		
		System.out.println("\nData Fields:");
		for(String field: qp.getDataFields()) {
			System.out.println(field);
		}
		
		System.out.println("\nFile name: " + qp.getFileName());
			
	}
	
	/**
	 * @return A (poorly) generated query string
	 */
	public static String generateQuery() {
		String[] command = {"Select", "Insert", "Delete", "Update"};
		String[] files = {"data.csv", "addresses.txt", "info.bin", "values.csv"};
  		String[] dataFields = {"name", "age", "where_to", "from_where", "date", "grade", "city"};
		String[] randomData = {"Brian","Michael","James","Nicole","Amber","Jonah","Ashleigh","Dustin","Jamal","Steven",
								"Manhattan","Queens","Brooklyn","Long_Island", "Other_City", "March","June","November"};
		String[] operators = {"=",">","<","<=",">="};
		
		String query = "";
		
		query += command[(int) (Math.random() * command.length)] + " ";
		
		int numFields = (int) (Math.random() * (dataFields.length - 2)) + 1 ;
		
		String[] fieldsUsed = new String[numFields];
		
		for(int i = 0; i < numFields; i++) {
			boolean added = false;
			
			while(!added) {
				boolean found = false;
		
				String randomField = dataFields[(int) (Math.random() * dataFields.length)];
				
				String[] splitQuery = query.split(" ");
				
				for(int j = 0; j < splitQuery.length; j++) {
					if(splitQuery[j].equals(randomField)) {
						found = true;
					}
				}
				
				if(!found) {
					query += (i == numFields - 1) ? randomField + " " : randomField + ", ";
					fieldsUsed[i] = randomField;
					added = true;
				}
			}
		}
		
		query += "from " + files[(int) (Math.random() * (files.length - 1))] + " ";
		
		Random addCondition = new Random();
		if(addCondition.nextBoolean()) {
			query += "where " + dataFields[(int) (Math.random() * (dataFields.length - 1))] + " "
					+ operators[(int) (Math.random() * (operators.length - 1))] + " "  
					+ randomData[(int) (Math.random() * (randomData.length - 1))] + " ";				
		}
		
		Random orderQuery = new Random();
		if(orderQuery.nextBoolean()) {
			query += "order by " + dataFields[(int) (Math.random() * (dataFields.length - 1))] + " ";				
		}
		
		Random groupQuery = new Random();
		if(groupQuery.nextBoolean()) {
			query += "group by " + dataFields[(int) (Math.random() * (dataFields.length - 1))] + " ";				
		}
		
		return query;
	}
}
