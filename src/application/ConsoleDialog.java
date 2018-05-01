package application;

import java.util.Scanner;

public class ConsoleDialog {

	private RandomNumber random;
	private static Scanner console = new Scanner(System.in);
	final String FULL_PROMPT = "\nEnter c (deposit),  a(add number), ? (inquiry), or q (quit): ";
	final String SHORT_PROMPT = "\nEnter c, a, ?, or q: ";
	
	public ConsoleDialog(RandomNumber random) {
		this.random = random;
	}
	
	/** Run the user interface. */
	public void run() {
		String choice = "";
		String prompt = FULL_PROMPT;
		loop: while (true) {
			System.out.printf("Sudoku contains %d \n", random.getBox());
			System.out.print(prompt);
			choice = console.next().trim().toLowerCase();
			prompt = SHORT_PROMPT;
			switch (choice) {
			case "c":
			case "checkRandom":
				random.remain();
				break;
			case "a":
			case "addNumber":
				addNumber();
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
	
	public void addNumber() {
		System.out.println("Type Number");
		this.random = new RandomNumber(Integer.parseInt(console.next()));
	}
}
