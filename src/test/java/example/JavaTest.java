package example;

import org.junit.Test;
import static org.junit.Assert.*;

public class JavaTest {

  @Test
  public void noOpTest() {
    System.out.println("Running noOpTest from class: " + this.getClass().getName());
    assertTrue( 1 + 1 == 2);
  }

}
