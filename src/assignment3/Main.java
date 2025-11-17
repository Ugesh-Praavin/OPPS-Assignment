package Assignment3;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        // Using CountDownLatch to synchronize task completion
        CountDownLatch latch = new CountDownLatch(5);
        
        // Define multiple tasks
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                try {
                    System.out.println("Task " + taskId + " is running on " 
                                       + Thread.currentThread().getName());
                    Thread.sleep(1000); // Simulate work
                    System.out.println("Task " + taskId + " completed.");
                } catch (InterruptedException e) {
                    System.out.println("Task interrupted: " + e);
                } finally {
                    latch.countDown();
                }
            });
        }
        
        try {
            // Wait for all tasks to finish
            latch.await();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        // Shut down the executor
        executor.shutdown();
        System.out.println("All tasks completed. Thread pool shut down.");
    }
}

