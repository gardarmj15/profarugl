package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
 
public class TicTacToeWebUI implements SparkApplication {
	//private static Board board;
	
    public static void main(String[] args) {
		//board = new Board();
		 
		staticFileLocation("/public");
        SparkApplication ticweb = new TicTacToeWebUI();
		
		String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }
		ticweb.init();
	}
	
	@Override
    public void init() {
	final Player p = new Player("zillidu","O");
        post("/random", (req, res) -> p.getNickname());
    }
}