import java.util.Scanner;

public class FloatMatch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		boolean exit = false;
		
		do {
			System.out.println("Enter Floating Point Number 1: ");
			Scanner scanner = new Scanner(System.in);
			String input1 = scanner.nextLine();
			
			System.out.println("Enter Floating Point Number 2: ");
			scanner = new Scanner(System.in);
			String input2 = scanner.nextLine();
			
			float float1 = Float.parseFloat(input1);
			float float2 = Float.parseFloat(input2);
			
			float1 *= 1000;
			float2 *= 1000;
			
			int intFloat1 = (int) float1;
			int intFloat2 = (int) float2;
			
			System.out.println(intFloat1 == intFloat2 ? "Same" : "Different");
			
			System.out.println("Enter q to quit, otherwise, Press Enter");
			scanner = new Scanner(System.in);
			String input3 = scanner.nextLine();
			
			
			if(input3.equals("q")) {
				exit = true;
				scanner.close();
			}
		}while(!exit);
		
		System.out.println("GoodBye!");
	}

}
