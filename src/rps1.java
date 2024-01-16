import java.util.Random;
import java.util.Scanner;

public class rps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String[] rps = {"r", "p", "s"};
		String computerChoice = rps[new Random().nextInt(rps.length)];
		
		Scanner scanner = new Scanner(System.in);
		String playerChoice;
		
		while(true) {
			System.out.println("Rock paper or scissor?");
			playerChoice = scanner.nextLine();
			if(playerChoice.equals("r")|| playerChoice.equals("s") || playerChoice.equals("p")) {
				break;
			}
			System.out.println("Invalid entry. Please try again.");
		}
		
		System.out.println("Computer choice is: " + computerChoice);
		
		if(playerChoice.equals(computerChoice)) {
			System.out.println("Tie. Try again.");
		}else if(playerChoice.equals("r") && playerChoice.equals("s")){
			System.out.println("Player wins.");
		}else if(playerChoice.equals("s") && playerChoice.equals("r")) {
			System.out.println("Player loses.");
		}else if(playerChoice.equals("r") && playerChoice.equals("p")){
			System.out.println("Player loses.");
		}else if(playerChoice.equals("p") && playerChoice.equals("r")) {
			System.out.println("Player wins.");
		}else if(playerChoice.equals("p") && playerChoice.equals("s")){
			System.out.println("Player loses.");
		}else if(playerChoice.equals("s") && playerChoice.equals("p")) {
			System.out.println("Player wins.");
		}
		*/
		
		
		String[] rps = {"r", "p", "s"};
		String computerChoice = rps[new Random().nextInt(rps.length)];
		
		Scanner scanner = new Scanner(System.in);
		String playerChoice;
		
		while(true) {
			System.out.println("Rock, paper or scissors?");
			playerChoice = scanner.nextLine();
			if (playerChoice.equals(computerChoice)) {
				break;
			}
			System.out.println("Tie... Play again:");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
