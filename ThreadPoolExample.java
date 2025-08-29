 import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String taskName;

    WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing " + taskName);
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.execute(new WorkerThread("Task " + i));
        }
        executor.shutdown();
    }
} 
