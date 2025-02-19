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
        S.O.P("Sagar"+4+2);
    }

}