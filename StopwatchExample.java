 public class StopwatchExample {
    public static void main(String[] args) {
        new Thread(() -> {
            int seconds = 0;
            try {
                while (true) {
                    System.out.println("Time elapsed: " + seconds + " seconds");
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println("Stopwatch stopped!");
            }
        }).start();
    }
} 