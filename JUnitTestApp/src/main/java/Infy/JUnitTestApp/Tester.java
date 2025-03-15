package Infy.JUnitTestApp;

public class Tester {

	public Tester() {
		System.out.println("Tester o-param constructor called!");
	}

	public float calculateRateOfInterest(float principal, float rate, int time) throws InterruptedException {
		Thread.sleep(1000);
		if (principal == 0 || rate == 0 || time == 0)
			throw new IllegalArgumentException("Invalid-inputs");
		return (principal * rate * time) / 100;
	}
}
