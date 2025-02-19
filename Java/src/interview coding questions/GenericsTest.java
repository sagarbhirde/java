public class GenericsChallenge {
    public static <T extends Number & Comparable<T>> T getMax(T num1, T num2) {
        return num1.compareTo(num2) > 0 ? num1 : num2;
    }
    public static void main(String[] args) {
        Integer int1 = 5;
        Integer int2 = 10;
        Double double1 = 3.5;
        Double double2 = 7.5;
        // Usage examples
        Integer maxInt = getMax(int1, int2);
        Double maxDouble = getMax(double1, double2);
    }
}
has context menu