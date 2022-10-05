package core;

public class Derived extends Base{
	private void method1(){}
	protected void method2(){}
	//public void method3()throws Exception{}
	public void method3()throws RuntimeException{
		Integer value=null;
		
		System.out.print(value*value);
	}
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Derived derived=new Derived();
	//derived.method3();

}

	

}
