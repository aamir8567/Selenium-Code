package jar;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
	 public static void main(String[] args) {
	        // Run the tests in FacebookHomePageTest
	        Result result = JUnitCore.runClasses(FacebookHomePageTest1.class);
	        // Print the result
	        System.out.println("Test successful: " + result.wasSuccessful());
	        System.out.println("Number of tests run: " + result.getRunCount());
	        System.out.println("Failures: " + result.getFailureCount());
	    }
}