package is.ru.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {
	@Test 
	public void testConstructor() {
		Player p = new Player("Siggi", "X");
		assertEquals("Siggi", p.getNickname());
		assertEquals("X", p.getSymbol());
	}
	
	@Test
	public void testSetNickname() {
		Player p = new Player("asd","asd");
		p.setNickname("Testname");
		p.setSymbol("X");
		assertEquals("Testname", p.getNickname());
		assertEquals("X", p.getSymbol());
	}
}