package core.constructors;

public class ConstructorChaining {

	public ConstructorChaining() {
		// TODO Auto-generated constructor stub
		this(5);
		System.out.println("default constructor");
	}
	
	public ConstructorChaining(int x) {
		// TODO Auto-generated constructor stub
		this(5,25);
		System.out.println("this is first parameterized constructor");
	}
	
	public ConstructorChaining(int x,int y) {
		// TODO Auto-generated constructor stub
		System.out.println("addition"+x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorChaining();

	}

}
