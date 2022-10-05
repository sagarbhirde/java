package core.finalscope;



public class Test1 {
	
	public Test1() {
		// TODO Auto-generated constructor stub
		var=55;
	}
	
	private final int var;
	
	private final String name="Sagar";

	
	void m1(){
	
		System.out.println(var);
	}
	
	void m2(){
		
		System.out.println(var);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Test1 s =new Test1();
			s.m1();
			s.m2();
			System.out.println("print "+s.name);
			int[] a=new int[-10];
			
			for (int i = a.length; i >0; i--) {
				System.out.println("Data of array"+i);
			}
	}

}
