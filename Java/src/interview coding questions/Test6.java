public class Main {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (lock2) {
                    System.out.println("Thread 1");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (lock1) {
                    System.out.println("Thread 2");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
has context menu


has context menu