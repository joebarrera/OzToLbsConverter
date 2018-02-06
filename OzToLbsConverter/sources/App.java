import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Creates scanner object
		Scanner input = new Scanner(System.in);

		int convertToDecision = 0;
		
		// do-while loop used to return the user back to the main menu if they've haven't chosen to exit the app
		do {	
		MainMenu mainMenu = new MainMenu();
		
		convertToDecision = input.nextInt();

			if (convertToDecision == 1) {
				System.out.println("Enter the number of ounces that you want converted to lbs.");
				double ouncesInput = input.nextDouble();

				ConvertOzToLbs convertOzToLbs = new ConvertOzToLbs(ouncesInput);
			} else if (convertToDecision == 2){
				System.out.println("Enter the number of lbs that you want converted to ounces.");
				double lbInput = input.nextDouble();

				ConvertLbsToOz convertLbsToOz0 = new ConvertLbsToOz(lbInput);
			} else if (convertToDecision == 3) {
				System.out.println("Good bye.");
			}
			else {
				System.out.println("You did not enter a valid input.");
			}
		}
		while(convertToDecision != 3); 
	}
}
