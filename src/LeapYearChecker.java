import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		boolean exit = false;
		
		do {
			System.out.println("Enter A Year: [Leave Blank to Exit]");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if(input.isEmpty()) {
				exit = true;
			}else {
				int year = Integer.parseInt(input);
				System.out.println(year%4 != 0 ? "Not a leap year":"Leap year");
			}
			
			if(exit) {
				scanner.close();
			}
		}while(!exit);
		
		System.out.println("GoodBye!");

	}

}
