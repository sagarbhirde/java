package java8features.functionalInterfaces;

import java.util.function.Function;

public class FunctionTest {
	
	public void calcuAddition(Integer value) {
		
	}

	public static void main(String[] args) {
		
		//Addition using function 
		Function<Integer, Double>function=i->i.doubleValue()+i.intValue();
		//Substraction using function
		Function<Integer, Integer>function2=i->i-i;
		//Multiplication using function
		Function<Double, Double>function3=i->i.doubleValue()*i.intValue();
		//Division using function
		Function<Double, Integer>function4=i->i.intValue()/i.intValue();
		System.out.println("Addition of two same values"+function.apply(5));
		System.out.println("Substraction of two same values"+function2.apply(43));
		System.out.println("Multiplication of two same values"+function3.apply(32.0));
		System.out.println("Division of two same values"+function4.apply(45.0));	
	}
	
}
