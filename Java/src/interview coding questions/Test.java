


public class Test{

    public static void main(String[] args) {
       String str = "Hello World";

       char[] ch = str.toCharArray();
         for(int i = str.length()-1;i>=0;i--)
         {
          System.out.print(str.charAt(i));
         }
    }
}