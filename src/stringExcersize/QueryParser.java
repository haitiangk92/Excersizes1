package stringExcersize;

public class QueryParser {
	String[] split;
	
	public QueryParser() {}
	
	public QueryParser(String query) {
		split = query.split(" ");
	}
	
	public void setQuery(String query) {
		split = query.split(" ");
	}
	
	public String[] getSplitQuery() {
		return split;
	}
	
	public String getMainQuery() {		
		for(int i = 0; i < split.length; i++) {
			if (split[i].equals("from")) {
				String main = "";
				for(int j = 0; j < i + 2; j++) {
					main += split[j] + " ";
				}
				return main;
			}
		}
		return "No Valid Query";
	}
	
	public String getCondition() {		
		for(int i = 0; i < split.length; i++) {
			if (split[i].equals("where")) {
				String where = "";
				for(int j = i; j < i + 4; j++) {
					where += split[j] + " ";
				}
				return where;
			}
		}
		return "No Logic Conditions";
	}
	
	public String getOrderByCondition() {		
		for(int i = 0; i < split.length; i++) {
			if (split[i].equals("order")) {
				return split[i + 2];
			}
		}
		return "No Ordering Condition";	
	}
	
	public String getGroupByCondition() {		
		for(int i = 0; i < split.length; i++) {
			if (split[i].equals("group")) {
				return split[i + 2];
			}
		}
		return "No Grouping Condition";
	}
	
	public String[] getDataFields() {
		String[] main = getMainQuery().split(" ");
		
		String[] fields = new String[main.length - 3];
		
		for(int i = 0; !main[i + 1].equals("from");i++) {
			if(main[i+1].charAt(main[i+1].length() - 1) == ',') {
				fields[i] = main[i+1].substring(0, main[i+1].length() - 1);
			}else{
				fields[i] = main[i + 1];
			}
		}
		return fields;	
	}
	
	public String getFileName() {
		String[] main = getMainQuery().split(" ");
		
		return main[main.length - 1];
	}
}
