package edu.pdx.CS410J.stuff;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import edu.pdx.cs410J.InvokeMainTestCase;
import static junit.framework.Assert.assertEquals;

/**
 * Tests the functionality in the {@link Project1} main class.
 */
public class Project1Test extends InvokeMainTestCase {

    /**
     * Invokes the main method of {@link Project1} with the given arguments.
     */
    private MainMethodResult invokeMain(String... args) {
        return invokeMain( Project1.class, args );
    }

  /**
   * Tests that invoking the main method with no arguments issues an error
   */
  @Test
  public void CorrectOutput() {
    MainMethodResult result = invokeMain();
    assertEquals(new Integer(0), result.getExitCode());
    assertTrue(result.getOut().contains( "1\n" +
            "2\n" +
            "Fizz\n" +
            "4\n" +
            "Buzz\n" +
            "Fizz\n" +
            "7\n" +
            "8\n" +
            "Fizz\n" +
            "Buzz\n" +
            "11\n" +
            "Fizz\n" +
            "13\n" +
            "14\n" +
            "FizzBuzz\n" +
            "16\n" +
            "17\n" +
            "Fizz\n" +
            "19\n" +
            "Buzz\n" +
            "Fizz\n" +
            "22\n" +
            "23\n" +
            "Fizz\n" +
            "Buzz\n" +
            "26\n" +
            "Fizz\n" +
            "28\n" +
            "29\n" +
            "FizzBuzz\n" +
            "31\n" +
            "32\n" +
            "Fizz\n" +
            "34\n" +
            "Buzz\n" +
            "Fizz\n" +
            "37\n" +
            "38\n" +
            "Fizz\n" +
            "Buzz\n" +
            "41\n" +
            "Fizz\n" +
            "43\n" +
            "44\n" +
            "FizzBuzz\n" +
            "46\n" +
            "47\n" +
            "Fizz\n" +
            "49\n" +
            "Buzz\n" +
            "Fizz\n" +
            "52\n" +
            "53\n" +
            "Fizz\n" +
            "Buzz\n" +
            "56\n" +
            "Fizz\n" +
            "58\n" +
            "59\n" +
            "FizzBuzz\n" +
            "61\n" +
            "62\n" +
            "Fizz\n" +
            "64\n" +
            "Buzz\n" +
            "Fizz\n" +
            "67\n" +
            "68\n" +
            "Fizz\n" +
            "Buzz\n" +
            "71\n" +
            "Fizz\n" +
            "73\n" +
            "74\n" +
            "FizzBuzz\n" +
            "76\n" +
            "77\n" +
            "Fizz\n" +
            "79\n" +
            "Buzz\n" +
            "Fizz\n" +
            "82\n" +
            "83\n" +
            "Fizz\n" +
            "Buzz\n" +
            "86\n" +
            "Fizz\n" +
            "88\n" +
            "89\n" +
            "FizzBuzz\n" +
            "91\n" +
            "92\n" +
            "Fizz\n" +
            "94\n" +
            "Buzz\n" +
            "Fizz\n" +
            "97\n" +
            "98\n" +
            "Fizz\n" +
            "Buzz" ));
  }

}