package devops.lab6;


import junit.framework.TestCase;

public class AppTest extends TestCase {

  private App app;

  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public AppTest(String testName) {
    super(testName);
    this.app = new App();
  }

  /**
   * Test for factorial of 0
   */
  public void testFact0() {
    assertEquals(
      "Factorial of 0 must be 1",
      1,
      this.app.calculateFactorial(0)
    );
  }

  /**
   * Test for factorial of 5
   */
  public void testFact5() {
    assertEquals(
      "Factorial of 5 must be 120",
      120,
      this.app.calculateFactorial(5)
    );
  }
}