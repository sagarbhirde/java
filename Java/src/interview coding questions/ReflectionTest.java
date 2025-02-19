public class Main {
    public static void main(String[] args) {
        String s = "Immutable";
        try {
            Field valueField = String.class.getDeclaredField("value");
            valueField.setAccessible(true);
            char[] value = (char[]) valueField.get(s);
            value[0] = 'M';
            System.out.println(s);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
has context menu