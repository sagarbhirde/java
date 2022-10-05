package core.oops.abstraction;

 interface InterfaceDemo {
	
	 void m2();
	 
	  default int abc(){
		return 0; 
	 }
	 
	 
	 public static void main(String[] args) {
		 System.out.println("ha interface ahe");		
	}
	
}

public class Test2 implements InterfaceDemo{

	public Test2(int a) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	 public static void main(String[] args) {
		 System.out.println("ha class ahe");
		}
	
}
