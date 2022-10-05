package core.exceptionhandling;

public class ExceptionHandling {

	@SuppressWarnings("finally")
	static Integer ExceptionChecking() {
		try {
			System.out.println("Try Block");
			return 1;
		} catch (Exception e) {
			System.out.println("Catch Block");
			return -1;
		} finally {
			System.out.println("Finally Block");
			return 2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print(ExceptionChecking());
	}

}
