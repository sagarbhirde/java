package java8features.functionalInterfaces;

import java.util.function.Predicate;

public class FunctionInterfaceTestClass {
	
	public static void main(String[] args) {
		
		
		CustomFunctionalInterface test=i->i>10;
		Predicate<Integer>predicate=v->v%2==0;
		System.out.println(predicate.test(9));
	}

}
