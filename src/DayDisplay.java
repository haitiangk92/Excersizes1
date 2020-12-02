import java.util.Scanner;

public class DayDisplay {

	public static void main(String[] args) {
		boolean exit = false;
		String days[] = {"Monday","Tuesday","Wednesday","Thursday","Firday","Saturday","Sunday"};
		
		do {
			System.out.println("Enter Any Number greater than zero: [Leave Blank to Exit]");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if(input.isEmpty()) {
				exit = true;
			}else {
				int num = Integer.parseInt(input);
				System.out.println(num > 0 ? days[(num - 1)%7] : "Must be grater than zero");
			}
			
			if(exit) {
				scanner.close();
			}
		}while(!exit);
		
		System.out.println("GoodBye!");

	}

}
