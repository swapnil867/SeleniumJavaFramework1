package demo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1() {
		
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("I am inside test 2");
		//int i=1/0;
	}
	
	@Test
	public void test3() {
	Assert.assertTrue(0>1);
		System.out.println("I am inside test 3");
	}

}
