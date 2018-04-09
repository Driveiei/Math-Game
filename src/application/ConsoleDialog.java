package application;

import java.util.Scanner;

public class ConsoleDialog {

	private RandomNumber random;
	private static Scanner console = new Scanner(System.in);
	final String FULL_PROMPT = "\nEnter d (deposit), w (withdraw), ? (inquiry), or q (quit): ";
	final String SHORT_PROMPT = "\nEnter d, w, ?, or q: ";
	
	public ConsoleDialog(RandomNumber random) {
		this.random = random;
	}
	
	/** Run the user interface. */
	public void run() {
		String choice = "";
		String prompt = FULL_PROMPT;
		loop: while (true) {
			System.out.printf("Sudoku contains %.2f \n", random.getBox());
			System.out.print(prompt);
			choice = console.next().trim().toLowerCase();
			prompt = SHORT_PROMPT;
			switch (choice) {
			case "d":
			case "deposit":
				depositDialog();
				break;
			case "w":
			case "withdraw":
				withdrawDialog();
				break;
			case "q":
				break loop; 
			default:
				System.out.println("\"" + choice + "\" is not a valid choice.");
				prompt = FULL_PROMPT;
			}
		}
		System.out.println("Goodbye.");
	}
	
	public void depositDialog() {
		
	}
	
	public void withdrawDialog() {
		
	}
}
