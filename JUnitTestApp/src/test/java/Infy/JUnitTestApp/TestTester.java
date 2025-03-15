package Infy.JUnitTestApp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * Junit is the framework which is used to do the user testing and peer testing
 * and we have to just put the @test annotation on top of the class and the
 * junit framework will automatically recognize and it will automatically create
 * the object of the class and \ call the methods automatically .
 * 
 * Methods learnt till now :: 1. assertEquals() --> check for the expected and
 * the actual value , if matching then pass otherwise failed 2. assertThrows()
 * --> check for the expected and the actual exception , if yes then pass
 * otherwise fail . 3. assertTimeOut() --> check if method is successfully
 * executed within given time -limit . 4. Executable class is the functional
 * interface which contains execute method .
 * 
 * Before-Each --> To create object of the business logic before executing the
 * test methods After-Each --> To destroy objects of the business login after
 * executing the test methods After-All --> Object destroyed once . Before-All
 * --> Object created once .
 */

@DisplayName("Tester Testing class")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestTester {

	private static Tester tester;

	@BeforeAll
	public static void setUp() {
		System.out.println("TestTester.setUp()");
		tester = new Tester();
	}

	@Test
	@DisplayName("Testing with Big Numbers")
	@Order(value = 3)
	@Tag("test")
	public void testWithBigNo() throws InterruptedException {
		float expected = 1.0f;
		Assertions.assertEquals(expected, tester.calculateRateOfInterest(100, 1, 1));
	}

	@Test
	@DisplayName("Testing with small numbers")
	@Order(value = 2)
	@Tag("dev")
	public void testWithSmallNo() throws InterruptedException {
		Assertions.assertEquals(10.0f, tester.calculateRateOfInterest(1000, 1, 1));
	}

	@Test
	@DisplayName("Testing with Exception class")
	@Order(value = 1)
	@Tag("uat")
	public void testInputsWithException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> tester.calculateRateOfInterest(0, 0, 0));
	}

	@AfterAll
	public static void cleanUp() {
		tester = null;
	}

}
