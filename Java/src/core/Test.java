package core;

 public class Test {
   static int x = 131;
   static class ClassY {
    static int y = x++;
    static class ClassZ {
    static int z = y++;
    }
   }
 
public static void main(String[] args)
{
       System.out.println(Test.x);
        System.out.println(Test.ClassY.y);
         System.out.println(Test.ClassY.ClassZ.z);
 }
 }