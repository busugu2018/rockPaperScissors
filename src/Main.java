import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] rps = {"r", "p", "s"};
		String computerMove = rps[new Random().nextInt(rps.length)];
		
		Scanner scanner = new Scanner(System.in);
		String playerMove;
		
		while(true) {
			System.out.println("Please enter your move (r, p, or s)");
			playerMove = scanner.nextLine();
			if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
				break;
			}
			System.out.println(playerMove + " is not a valid move.");
		}
		
		System.out.println("Computer player: " + computerMove);
		if (playerMove.equals(computerMove)) {
			System.out.println("The game was a tie");
		}
		else if(playerMove.equals("r") && computerMove.equals("s")){
			System.out.println("Player wins.");
		}		
		else if(playerMove.equals("s") && computerMove.equals("r")){
			System.out.println("Player loses.");
		}
		else if(playerMove.equals("r") && computerMove.equals("p")){
			System.out.println("Player loses.");
		}
		else if(playerMove.equals("p") && computerMove.equals("r")){
			System.out.println("Player wins.");
		}
		else if(playerMove.equals("s") && computerMove.equals("p")){
			System.out.println("Player wins.");
		}
		else if(playerMove.equals("p") && computerMove.equals("s")){
			System.out.println("Player loses.");
		}
	}

}
