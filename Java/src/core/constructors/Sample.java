package core.constructors;

public class Sample {
	
	private static String name;
	
	public Sample(String name ){
		Sample.name=name;
		System.out.println("mi varcha constructor");
	}
	
	static void m1(){
		System.out.println("Result "+name);
	}

}
