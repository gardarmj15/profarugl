package is.ru.tictactoe;

public class Board {
    private Player[] board;

   /**
    * Initializes an empty board.
    */
    Board() {
        board = new Player[9];
    }

   /**
    * Clears the board.
    */
    public void clearBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = null;
        }
    }

   /**
    * Verify that the index is valid.
    *
    * @param index the index we want to verify
    * @throws IndexOutOfBoundsException if index is invalid
    */
    public void validateIndex(int index) {
        if (index < 0 || index >= 9) {
            throw new IndexOutOfBoundsException("Index " + index + " is not between 0 and 8");
        }
    }

   /**
    * Sets the player at the specified index.
    *
    * @param  player the player to be set at index
    * @param  index the index where the player is to be set
    * @throws IndexOutOfBoundsException if index is invalid
    */
    public void set(Player player, int index) {
        validateIndex(index);
        board[index] = player;
    }

   /**
    * Returns the Player at position index.
    *
    * @param  index the index of the Player we want
    * @return the Player at position index
    * @throws IndexOutOfBoundsException if index is invalid
    */
    public Player get(int index) {
        validateIndex(index);
        return board[index];
    }

   /**
    * Returns true if the cell at position index is empty.
    *
    * @param  index the index of the cell to be checked
    * @return true if the cell at position index is empty
    * @throws IndexOutOfBoundsException if index is invalid
    */
    public Boolean isEmpty(int index) {
        validateIndex(index);
        return board[index] == null;
    }

   /**
    * Returns true if the board is full.
    *
    * @return true if the board is full.
    */
    public Boolean isFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] == null) {
                return false;
            }
        }
        return true;
    }

   /**
    * Returns a string representation of the board
    *
    * @return a string representation of the board
    */
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            String symbol = board[i] == null ? " " : board[i].getSymbol();
            str.append(" " + symbol + " ");

            if ((i+1) % 3 == 0) {
                str.append(i != 8 ? "\n---+---+---\n" : "\n");
            } else {
                str.append("|");
            }
        }
        return str.toString();
    }

   /**
    * Returns true if player p is winner.
    *
    * @param p the Player to be checked
    * @return true if p is winner
    */
    public Boolean isWinner(Player p) {
        return isHorizontalWinner(p) || isVerticalWinner(p) || isDiagonalWinner(p);
    }

   /**
    * Returns true if Player p won with a horizontal line.
    *
    * @param p the Player to be checked
    * @return true if Player p won with a horizontal line
    */
    public Boolean isHorizontalWinner(Player p) {
        return p == board[0] && p == board[1] && p == board[2] ||
               p == board[3] && p == board[4] && p == board[5] ||
               p == board[6] && p == board[7] && p == board[8];
    }

   /**
    * Returns true if Player p won with a vertical line.
    *
    * @param p the Player to be checked
    * @return true if Player p won with a vertical line
    */
    public Boolean isVerticalWinner(Player p) {
        return p == board[0] && p == board[3] && p == board[6] ||
               p == board[1] && p == board[4] && p == board[7] ||
               p == board[2] && p == board[5] && p == board[8];
    }

   /**
    * Returns true if Player p won with a diagonal line.
    *
    * @param p the Player to be checked
    * @return true if Player p won with a diagonal line
    */
    public Boolean isDiagonalWinner(Player p) {
        return p == board[0] && p == board[4] && p == board[8] ||
               p == board[2] && p == board[4] && p == board[6];
    }
}
