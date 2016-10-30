package is.ru.tictactoe;

import java.util.Scanner;

public class ConsoleUI {
    private Board board;
    private Scanner in;
    private Player p1, p2, curr;

   /**
    * Initializes a new Console UI.
    */
    ConsoleUI() {
        board = new Board();
        in = new Scanner(System.in);
    }

   /**
    * Prints out the name of the game.
    */
    public static void printWelcome() {
        System.out.println("\n");
        System.out.println(" /$$$$$$$$ /$$        /$$$$$$$$               /$$$$$$$$");
        System.out.println("|__  $$__/|__/       |__  $$__/              |__  $$__/");
        System.out.println("   | $$    /$$  /$$$$$$$| $$  /$$$$$$   /$$$$$$$| $$  /$$$$$$   /$$$$$$");
        System.out.println("   | $$   | $$ /$$_____/| $$ |____  $$ /$$_____/| $$ /$$__  $$ /$$__  $$");
        System.out.println("   | $$   | $$| $$      | $$  /$$$$$$$| $$      | $$| $$  \\ $$| $$$$$$$$");
        System.out.println("   | $$   | $$| $$      | $$ /$$__  $$| $$      | $$| $$  | $$| $$_____/");
        System.out.println("   | $$   | $$|  $$$$$$$| $$|  $$$$$$$|  $$$$$$$| $$|  $$$$$$/|  $$$$$$$");
        System.out.println("   |__/   |__/ \\_______/|__/ \\_______/ \\_______/|__/ \\______/  \\_______/");
        System.out.println("\n");
    }

   /**
    * Parses input from user from string to integer.
    * @param str the user input
    * @return integer version of user input, or -1 if it's invalid
    */
    public int getInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

   /**
    * Initializes a new PvP game. Prompts users for names.
    */
    public void initializePvP() {
        System.out.println("Player 1 - Please enter your name: ");
        p1 = new Player(in.nextLine(), "X");

        System.out.println("Player 2 - Please enter your name: ");
        p2 = new Player(in.nextLine(), "O");
    }

   /**
    * Switches who's player's turn it is.
    */
    public void switchPlayer() {
        curr = curr == p1 ? p2 : p1;
    }

   /**
    * Starts a new game. Includes the game logic.
    */
    public void startGame() {
        printWelcome();
        initializePvP();
        curr = p1;

        System.out.println(p1.getNickname() + " vs. " + p2.getNickname());
        System.out.println("------------------------------");
        while (true) {
            System.out.println("It's your turn " + curr.getNickname());
            System.out.println(board);
            System.out.print("Select cell from 1 to 9: ");
            int move = getInt(in.nextLine());
            if (move < 1 || move > 9) {
                System.out.println("Invalid input. Please try again.");
                continue;
            } else if (!board.isEmpty(move - 1)) {
                System.out.println("Cell number " + move + " is not empty!. Try again.");
                continue;
            }

            board.set(curr, move - 1);

            if (board.isWinner(curr)) {
                System.out.println(board);
                System.out.println("Winner is: " + curr.getNickname());
                break;
            } else if (board.isFull()) {
                System.out.println(board);
                System.out.println("Draw!");
                break;
            }

            switchPlayer();
            System.out.println();
        }
    }
}
