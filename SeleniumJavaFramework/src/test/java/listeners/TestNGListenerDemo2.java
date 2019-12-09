package listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(listeners.TestNGListeners.class)  //Multiple classes can be add using commas
public class TestNGListenerDemo2 { 

	@Test
	public void test4() {
		System.out.println("I am inside Test 4");
	}
	@Test
	public void test5() {
		System.out.println("I am inside Test 5");
		//Assert.assertTrue(false);
	}
	@Test
	public void test6() {
		System.out.println("I am inside Test 6");
		throw new SkipException("This test is Skipped"); 
	}
}
