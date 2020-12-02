import java.util.Scanner;

public class FloatReader {

	public static void main(String[] args) {
		
		boolean exit = false;
		
		do {
			System.out.println("Enter a floating point number: [Leave Blank to Exit]");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if(input.isEmpty()) {
				exit = true;
			}else {
				float number = Float.parseFloat(input);
				String modifier = "";
				
				if(Math.abs(number) < 1) {
					modifier = "Small ";
				}else if(number > 1000000) {
					modifier = "Large ";
				}
				
				if(number == 0) {
					System.out.println("Zero");
				}else {
					System.out.println(modifier + (number > 0 ? "Positive ":"Negative ") + "Number");
				}
			}
			
			if(exit) {
				scanner.close();
			}
		}while(!exit);
		
		System.out.println("GoodBye!");

	}

}
