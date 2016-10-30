package is.ru.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {
    @Test
    public void testValidateIndex() {
        Board b = new Board();
        b.validateIndex(0);
        b.validateIndex(1);
        b.validateIndex(5);
        b.validateIndex(8);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testValidateIndexLow() {
        Board b = new Board();
        b.validateIndex(-1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testValidateIndexHigh() {
        Board b = new Board();
        b.validateIndex(9);
    }

    @Test
    public void testIsEmpty() {
        Board b = new Board();
        Player p1 = new Player("Test1", "X");
        Player p2 = new Player("Test2", "O");
        b.set(p1, 0);
        b.set(p2, 1);
        b.set(p1, 3);
        b.set(p2, 7);
        assertEquals(true, b.isEmpty(2));
        assertEquals(true, b.isEmpty(4));
        assertEquals(true, b.isEmpty(8));
        assertEquals(false, b.isEmpty(0));
        assertEquals(false, b.isEmpty(7));
    }

    @Test
    public void testSetAndGet() {
        Board b = new Board();
        Player p = new Player("Test", "X");

        b.set(p, 2);
        b.set(p, 5);
        assertEquals(p, b.get(2));
        assertEquals(p, b.get(5));
        assertEquals(null, b.get(3));
    }

    @Test
    public void testIsFull() {
        Board b = new Board();
        Player p1 = new Player("Test1", "X");
        Player p2 = new Player("Test2", "O");

        assertEquals(false, b.isFull());
        for (int i = 0; i < 8; i++) {
            b.set(p1, i);
        }
        assertEquals(false, b.isFull());
        b.set(p2, 8);
        assertEquals(true, b.isFull());
    }

    @Test
    public void testToString() {
        Board b = new Board();
        Player p1 = new Player("Test1", "X");
        Player p2 = new Player("Test2", "O");
        b.set(p1, 1);
        b.set(p1, 4);
        b.set(p1, 7);
        b.set(p2, 6);
        b.set(p2, 8);
        assertEquals("   | X |   \n---+---+---\n   | X |   \n---+---+---\n O | X | O \n", b.toString());
    }

    @Test
    public void testIsHorizontalWinner() {
        Board b = new Board();
        Player p = new Player("Test", "X");

        b.set(p, 0);
        assertEquals(false, b.isHorizontalWinner(p));
        b.set(p, 1);
        assertEquals(false, b.isHorizontalWinner(p));
        b.set(p, 2);
        assertEquals(true, b.isHorizontalWinner(p));

        b.clearBoard();

        b.set(p, 3);
        assertEquals(false, b.isHorizontalWinner(p));
        b.set(p, 4);
        assertEquals(false, b.isHorizontalWinner(p));
        b.set(p, 5);
        assertEquals(true, b.isHorizontalWinner(p));

        b.clearBoard();

        b.set(p, 6);
        assertEquals(false, b.isHorizontalWinner(p));
        b.set(p, 7);
        assertEquals(false, b.isHorizontalWinner(p));
        b.set(p, 8);
        assertEquals(true, b.isHorizontalWinner(p));
    }

    @Test
    public void testIsVerticalWinner() {
        Board b = new Board();
        Player p = new Player("Test", "X");

        b.set(p, 0);
        assertEquals(false, b.isVerticalWinner(p));
        b.set(p, 3);
        assertEquals(false, b.isVerticalWinner(p));
        b.set(p, 6);
        assertEquals(true, b.isVerticalWinner(p));

        b.clearBoard();

        b.set(p, 1);
        assertEquals(false, b.isVerticalWinner(p));
        b.set(p, 4);
        assertEquals(false, b.isVerticalWinner(p));
        b.set(p, 7);
        assertEquals(true, b.isVerticalWinner(p));

        b.clearBoard();

        b.set(p, 2);
        assertEquals(false, b.isVerticalWinner(p));
        b.set(p, 5);
        assertEquals(false, b.isVerticalWinner(p));
        b.set(p, 8);
        assertEquals(true, b.isVerticalWinner(p));
    }

    @Test
    public void testIsDiagonalWinner() {
        Board b = new Board();
        Player p = new Player("Test", "X");

        b.set(p, 0);
        assertEquals(false, b.isDiagonalWinner(p));
        b.set(p, 4);
        assertEquals(false, b.isDiagonalWinner(p));
        b.set(p, 8);
        assertEquals(true, b.isDiagonalWinner(p));

        b.clearBoard();

        b.set(p, 2);
        assertEquals(false, b.isDiagonalWinner(p));
        b.set(p, 4);
        assertEquals(false, b.isDiagonalWinner(p));
        b.set(p, 6);
        assertEquals(true, b.isDiagonalWinner(p));
    }

    @Test
    public void testIsWinner() {
        Board b = new Board();
        Player p = new Player("Test", "X");

        b.set(p, 1);
        assertEquals(false, b.isWinner(p));
        b.set(p, 4);
        assertEquals(false, b.isWinner(p));
        b.set(p, 7);
        assertEquals(true, b.isWinner(p));

        b.clearBoard();

        b.set(p, 0);
        assertEquals(false, b.isWinner(p));
        b.set(p, 4);
        assertEquals(false, b.isWinner(p));
        b.set(p, 8);
        assertEquals(true, b.isWinner(p));

        b.clearBoard();

        b.set(p, 3);
        assertEquals(false, b.isWinner(p));
        b.set(p, 4);
        assertEquals(false, b.isWinner(p));
        b.set(p, 5);
        assertEquals(true, b.isWinner(p));
    }

    @Test
    public void testClearBoard() {
        Board b = new Board();
        Player p = new Player("Test", "X");
        for (int i = 0; i < 9; i++) {
            b.set(p, i);
        }
        b.clearBoard();
        for (int i = 0; i < 9; i++){
            assertEquals(null, b.get(i));
        }
    }

}
