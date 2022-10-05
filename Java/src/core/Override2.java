package core;



public class Override2 extends Override{
	
	
	

	
	 int m1() {
		return 2;
		
	}
	
	public static void main(String[] args) {
		Override override= new Override();
		int abc=override.m1();
		System.out.println(abc);
}
}