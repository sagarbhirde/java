class Demo {

    static int i = m1();

    static {

        System.out.println("---static block----");
    }

    public static int m1()
    {
        System.out.println("---m1 method -----");

    }

    public static void main(String[] args)
    {
        System.out.println("----main method ----");
        System.out.println(i);

    }


}
class ClassX {    static int x = 131;    ... by Nilesh Ugale
    Nilesh Ugale
3:17 PM
    class ClassX {
        static int x = 131;

        static class ClassY {


            static int y = x++;

            static class ClassZ {
                static int z = y++;

            }
        }

        public static void main(String[] args)
        {

            System.out.println(ClassX.x);
            System.out.println(ClassX.ClassY.y);
            System.out.println(ClassX.ClassY.ClassZ.z);

        }

    }
    class ClassA {   public static void main(St... by Nilesh Ugale
            Nilesh Ugale
            3:19 PM
            class ClassA {

        public static void main(String[] args)
        {
            System.out.println("Sagar"+2+4);
            System.out.println(3+4+"Sagar") ;

        }
    }
        public class Test {       int x = 100; ... by Nilesh Ugale
            Nilesh Ugale
3:22 PM
            public class Test {
                int x = 100;
                public static void main(String[] args)
                {
                    Test t = null;
                    System.out.println(t.x);
                }

            }
            List<Integer> numbers = Arrays.asList(1, 2,... by Nilesh Ugale
            Nilesh Ugale
3:25 PM
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            has context menu