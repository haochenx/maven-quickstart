package name.haochenxie.quickstart;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  /**
   * Rigourous Test. :-)
   */
  @Test
  public void testGetGreetingString() {
    String greeting = App.getGreetingString();

    assertNotNull(greeting);
    assertTrue(greeting.length() > 0);
  }

}
