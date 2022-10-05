package core.oops.inheritance;

import core.oops.abstraction.AbstractMain;

public class Demo extends AbstractMain {

	public Demo(int a) {
		super(a);
		System.out.println("mi Demo class cha constructor ahe");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo(5);

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}
