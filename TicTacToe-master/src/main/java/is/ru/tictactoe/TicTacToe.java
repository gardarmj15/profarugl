package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean web = false;

        if (args.length > 0) {
            if (args[0].equals("web")) {
                web = true;
            }
        } else {
            System.out.println("1. ConsoleUI");
            System.out.println("2. Web UI");
            System.out.print("Select a game mode: ");
            String mode = in.nextLine();

            if (mode.equals("web") || mode.equals("2")) {
                web = true;
            }
        }

        if (web) {
            TicTacToeWebUI webui = new TicTacToeWebUI();
            webui.setup();
        } else {
            ConsoleUI ui = new ConsoleUI();
            ui.startGame();
        }
    }
}
