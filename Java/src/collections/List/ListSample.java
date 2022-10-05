package collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
	
	public static void main(){
		System.out.println("this is second main method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>abc=new ArrayList<>();
		abc.add(0,5);
		abc.add(0,10);
		/*Integer abc1=abc.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("first value:- "+abc1);*/
		abc.forEach((v)->System.out.println(v));
		

	}

}
