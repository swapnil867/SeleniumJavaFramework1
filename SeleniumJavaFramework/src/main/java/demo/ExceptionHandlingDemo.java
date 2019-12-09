package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	public static void demo() throws Exception {



		System.out.println("Hello World..!");
		throw new ArithmeticException("Not valid operation");
		//int i= 1/0; //This line was an exception
		//System.out.println("Completed");


	}

}
