class Demo {

    static int i = m1();

    static {
        System.out.println("---static block----");
    }

    public static int m1()
    {
        System.out.println("---m1 method -----");
        return 100;

    }

    public static void main(String[] args)
    {
        System.out.println("----main method ----");
        System.out.println(i);
    }
}