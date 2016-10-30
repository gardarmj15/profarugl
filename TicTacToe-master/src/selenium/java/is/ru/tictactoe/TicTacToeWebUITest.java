package is.ru.tictactoe;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TicTacToeWebUITest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://hnetusmjor.herokuapp.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

//BEGIN TEST FOR X

  @Test
  public void testXhasWonHorizontally() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(1200);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div/div")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div[2]/div[2]")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div/div[2]")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div[3]")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[3]")).click();
    Thread.sleep(500);

    assertEquals("X has won!", driver.findElement(By.id("tic-status")).getText());
    Thread.sleep(750);

  }


  @Test
  public void testXhasWonVertically() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(1200);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div/div")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div/div[2]")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div[2]/div")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div[2]/div[2]")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[3]/div")).click();
    Thread.sleep(500);

    assertEquals("X has won!", driver.findElement(By.id("tic-status")).getText());
    Thread.sleep(750);
  }

  @Test
  public void testXhasWonDiagonally() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(1200);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div/div")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div/div[2]")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div[2]/div[2]")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[2]/div[3]")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.xpath("//div[3]/div[3]")).click();
    Thread.sleep(500);

    assertEquals("X has won!", driver.findElement(By.id("tic-status")).getText());
    Thread.sleep(750);
  }

// END TEST FOR X


// BEGIN TEST FOR O

  @Test
  public void testOhasWonHorizontally() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(1200);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.third")).click();
    Thread.sleep(500);

    assertEquals("O has won!", driver.findElement(By.id("tic-status")).getText());
    Thread.sleep(750);
  }

  @Test
  public void testOhasWonVertically() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(1200);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.third")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("O has won!", driver.findElement(By.id("tic-status")).getText());
    Thread.sleep(750);
  }

  @Test
  public void testOhasWonDiagonally() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(1200);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.third")).click();
    Thread.sleep(500);

    assertEquals("O has won!", driver.findElement(By.id("tic-status")).getText());
    Thread.sleep(750);
  }

// END TEST FOR O

//BEGIN TEST TIE

  @Test
  public void testTie() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(1200);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.first")).click();
    Thread.sleep(500);
    
    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.second")).click();
    Thread.sleep(500);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.first")).click();
    Thread.sleep(500);
    
    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.second")).click();
    Thread.sleep(500);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.second")).click();
    Thread.sleep(500);
    
    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.third")).click();
    Thread.sleep(500);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.third")).click();
    Thread.sleep(500);
    
    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.first")).click();
    Thread.sleep(500);
    
    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.third")).click();
    Thread.sleep(500);
    
    assertEquals("Tie!", driver.findElement(By.id("tic-status")).getText());
    Thread.sleep(750);
  }

// END TEST TIE

// BEGIN TEST RESET BUTTON

@Test
  public void testResetButton() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(1200);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.third")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.id("tic-reset")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, O!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.second > div.tic-cell.second")).click();
    Thread.sleep(500);

    assertEquals("It's your turn, X!", driver.findElement(By.id("tic-status")).getText());
    driver.findElement(By.cssSelector("div.tic-row.third > div.tic-cell.first")).click();
    Thread.sleep(500);

    assertEquals("X has won!", driver.findElement(By.id("tic-status")).getText());
    Thread.sleep(750);
  }

// END TEST RESET BUTTON

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
