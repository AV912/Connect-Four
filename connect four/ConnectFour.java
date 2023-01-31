import java.util.Scanner;

/**
 * <h1>Connect 4
 * <h1>
 * This program allows two users to play a game of Connect Four using the same
 * keyboard for input.
 * <p>
 * 
 * @author Anand Viswanathan
 * @version 1.0
 * @since 2022-06-2
 */

public class ConnectFour {

    public static void main(String[] args) {
        Board c4 = new Board();
        Scanner scan = new Scanner(System.in);

        c4.printBoard();
        boolean gameIsOver = false;
        while (!(gameIsOver)) {
            System.out.println("It's Red's Turn...\n");
            int column = Integer.valueOf(scan.nextLine());
            gameIsOver = c4.redTurn(column);

            if (gameIsOver) {
                System.out.println("Red Wins!");
                break;
            } else {
                System.out.println("...");
            }

            System.out.println("It's Yellow's Turn...\n");
            column = Integer.valueOf(scan.nextLine());
            gameIsOver = c4.yellowTurn(column);
            if (gameIsOver) {
                System.out.println("Yellow Wins!");
            } else {
                System.out.println("...");
            }
        }

        scan.close();

    }
}