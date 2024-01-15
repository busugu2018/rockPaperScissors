import java.util.Random;
import java.util.Scanner;

public class rps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] rps = {"r", "p", "s"};
		String computerMove = rps[new Random().nextInt(rps.length)];
		
		Scanner scanner = new Scanner(System.in);
		String playerMove;
		
		while(true) {
			System.out.println("Rock - r, paper - p or scissor - s?");
			playerMove = scanner.nextLine();
			if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
				break;
			}
			System.out.println(playerMove + " is not valid");
		}
		
		System.out.println("Computer player: " + computerMove);
		
		if (playerMove.equals(computerMove)) {
			System.out.println("We have a tie breaker, play again.");
		}
		if (playerMove.equals("r") && computerMove.equals("s")) {
			System.out.println("Player wins.");
		}else if(playerMove.equals("s") && computerMove.equals("r")) {
			System.out.println("Player loses.");
		}
		if (playerMove.equals("r") && computerMove.equals("p")) {
			System.out.println("Player loses.");
		}else if(playerMove.equals("p") && computerMove.equals("r")) {
			System.out.println("Player wins.");
		}
		if (playerMove.equals("p") && computerMove.equals("s")) {
			System.out.println("Player loses.");
		}else if(playerMove.equals("s") && computerMove.equals("p")) {
			System.out.println("Player wins.");
		}
		
		
	}

}
