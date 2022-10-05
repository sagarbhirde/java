package core;

public class BlockTest {
	
	public BlockTest(){
		System.out.println("this is constructor block");
	}
	
	{
		System.out.println("this is instance block");
	}
	
	static{
		System.out.println("this is static block");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method");
		BlockTest blockTest=new BlockTest();
	}

}
