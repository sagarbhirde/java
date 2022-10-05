package core.exceptionhandling;

public class TryCatch {

	static Integer m1() {

		try {
			System.out.print("try"+1/0);
			return 1;
		} catch (Exception e) {
			System.out.print("catch");
			return 2;
		} finally {
			System.out.print("finally");
			return 3;
		}
		//return null;

	}


	public static void main(String[] args) {
		System.out.println(m1());

	}
}

