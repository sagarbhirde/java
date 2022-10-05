package core.oops.polymorphism.overloading;

public class MethodOverloadingTest {

	public void method1(Double d) {
		System.out.println("This is PARAMETER DOUBLE");
	}

	public void method1(Integer i) {
		System.out.println("This is PARAMETER INTEGER");
	}

	public void method1(int i) {
		System.out.println("This is PARAMETER INT");
	}

	public void method1(Number i) {
		System.out.println("This is PARAMETER NUMBER");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingTest b = new MethodOverloadingTest();
		b.method1(2);

	}

}
