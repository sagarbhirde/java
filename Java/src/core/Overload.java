package core;

public class Overload {
	
	
		private static void method1(final Double d){
			
		}
		private void method1(final Integer i){
			
		}
	
		
		public void method1(Object o) {
			System.out.println("Object");
		}

		public void method1(Exception e) {
			System.out.println("Exception");
		}

		public void method1(NullPointerException ne) {
			System.out.println("NullPointerException");
		}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Overload oc=new Overload();
		//oc.method1(1);
		//new Overload().method1(null);
		//method1(2.0);
	}

}
