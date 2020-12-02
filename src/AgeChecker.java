import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		
		boolean exit = false;
		
		do {
			System.out.println("Enter Your Age: [Leave Blank to Exit]");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if(input.isEmpty()) {
				exit = true;
			}else {
				int age = Integer.parseInt(input);
				System.out.println(age > 17 ? "You are and adult":"You are a minor");
			}
			
			if(exit) {
				scanner.close();
			}
		}while(!exit);
		
		System.out.println("GoodBye!");
	}
	
}