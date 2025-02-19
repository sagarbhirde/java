public class GCChallenge {
    public static void main(String[] args) {
        List<String> longLivedList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10_000; j++) {
                String shortLivedString = "ShortLived-" + i + "-" + j;
            }
            longLivedList.add("LongLived-" + i);
        }
    }
}
has context menu