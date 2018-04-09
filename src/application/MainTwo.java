package application;

public class MainTwo {
	
	 public static void main(String[] args) {
		RandomNumber random = new RandomNumber(9);
		ConsoleDialog console = new ConsoleDialog(random);
		console.run();
	 }
}
