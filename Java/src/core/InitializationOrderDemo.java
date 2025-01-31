package core;

public class InitializationOrderDemo
{
   
    static int i = m1();

    static {
        System.out.println("---static block----");
    }

    {
        System.out.println("---instance initializer block----");
    }

    public InitializationOrderDemo() {
        System.out.println("---constructor block----");
    }

    public static int m1() {
        System.out.println("---m1 method -----");
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("----main method ----");
      InitializationOrderDemo t = new InitializationOrderDemo();
    }
}