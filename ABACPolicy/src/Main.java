import java.util.Scanner;

/**
 * Name- Callan Jansen 
 * Description- create an attribute-based access control
 * engine that responds to authorization requests from the local command line.
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		boolean isUserFinished = false;
		String userInput = "";

		do {
			System.out.println("Main menu.");
			System.out.println("[A] - Attributes");
			System.out.println("[E] - Entities");
			System.out.println("[P] - Permissions");
			System.out.println("[R] - Request Access");
			
			userInput = keyboard.nextLine();

			switch (userInput.toUpperCase().charAt(0)) {
			case 'A':
						// attributes
				break;
			case 'E':
						// entities
				break;
			case 'P':
						// permissions
				break;
			case 'R':
						// request access
				break;
			case 'Q':
				isUserFinished = true;
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}

		} while (isUserFinished == false);
		
		keyboard.close();
	}

}
