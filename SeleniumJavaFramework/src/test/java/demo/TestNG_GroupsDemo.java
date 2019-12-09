package demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestNG_GroupsDemo {
	
	@Test(groups= {"Sanity"})
	public void test1() {
		System.out.println("This is Test 1");
	}
	
	@Test(groups= {"windows.Regression"})
	public void test2() {
		System.out.println("This is Test 2");
	}
	
	@Test(groups= {"linux.Regression"})
	public void test3() {
		System.out.println("This is Test 3");
	}

	@Test
	public void test4() {
		System.out.println("This is Test 4");
	}
}
