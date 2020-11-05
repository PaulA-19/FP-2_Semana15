import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String again;
		Game game;
		do {
			game = new Game();
			game.prepararCartas();
			game.playAGame();
			System.out.print("\n\nPlay another game (y/n)?: ");
			again = scan.nextLine();
		} while (again.equals("y"));
	}

}