package core.oops.abstraction;

abstract class AbstractClass {

	public abstract void m1();

	int a;

	public AbstractClass() {
		System.out.println("Im Abstract class Constructor");
	}

	public AbstractClass(int a) {
		this.a = a;
		System.out.println("this is parameterised Abstract class Constructor");
	}
}

public abstract class AbstractMain extends AbstractClass implements InterfaceDemo {

	public AbstractMain(int a) {
		super(a);
		// new Demo(a);
	}

	public static void main(String[] args) {
		AbstractMain a = new AbstractMain(5) {

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("this is second method");
			}

			@Override
			public void m1() {
				// TODO Auto-generated method stub

			}
		};
		a.m2();
	}

}
