package qaautomation.october2021;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseWebTestHeadless {
	/**
	 * Rigorous Test :-)
	 */
	@Test(testName = "Verify 1 is 1 so it true", description = "this will verify if 1 is 1 will return assert true")
	public void shouldAnswerWithTrue() {
		assertEquals(1, 1);
	}

	@Test(testName = "Verify 1 is 2 so it will return false", description = "this will verify if 1 is 2 will return assert false")
	public void shouldReturnFalse() {
		assertEquals(1, 2);
	}
}
