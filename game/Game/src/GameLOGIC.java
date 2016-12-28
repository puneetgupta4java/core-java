import java.util.Scanner;

/**
 * 
 * @author puneet gupta
 * 
 * its is a game which is produced my me
 * its a prototype of the game battleship 
 * but it does not contain GUI
 * it is only used to check the logic
 * & run it over command prompt
 * 
 * 
 */
public class GameLOGIC {

	public static void main(String[] args) {
		int guess = 00;
		int ptr = 0;
		boolean ch = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("enter your name");
		String name = scanner.next();
		System.out.println("you are ready to sink the enemy ship captain "+name);
		System.out.println("-----------------");
		for(int i=0;i<7;i++){
			System.out.println("|* * * * * * *|");
		}
		System.out.println("-----------------");
		
		GameDAO gameDAO = new GameDAO();
		while (ch == false) {
			System.out.println("enter the coordinates");
			guess = scanner.nextInt();
			ptr++;
			ch = gameDAO.test(guess);
		}
		System.out.println("game is over");
		int score = 109 - ptr;
		System.out.println("your score is " + score);
	}

}
