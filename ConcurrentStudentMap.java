import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentStudentMap {
    static final int THREAD_COUNT = 5;
    static final int RECORDS_PER_THREAD = 1000;

    public static void main(String[] args) throws InterruptedException{
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        int expectedEntries = THREAD_COUNT * RECORDS_PER_THREAD;

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        long startTime = System.nanoTime();

        for (int t = 0; t < THREAD_COUNT; t++) {
            final int threadNumber = t;
            executor.execute(() -> {
                for (int i = 0; i < RECORDS_PER_THREAD; i++) {
                    String key = "Thread-" + threadNumber + "-" + i;
                    concurrentMap.put(key, i);
                }
            });
        }
        executor.shutdown();
        boolean finished = executor.awaitTermination(10, TimeUnit.SECONDS);

        long endTime = System.nanoTime();

        if (!finished) {
            executor.shutdownNow();
            System.out.println("Tasks timed out.");
            return;
        }

        Integer sampleValue = concurrentMap.get("Thread-2-500");
        long timeTakenMs = (endTime - startTime) / 1_000_000;
        System.out.println("--- ConcurrentHashMap Results ---");
        System.out.println("Number of Threads: " + THREAD_COUNT);
        System.out.println("Expected entries:  " + expectedEntries);
        System.out.println("Actual entries:    " + concurrentMap.size());
        System.out.println("Sample Retrieval:  Thread-2-500 -> " + sampleValue);
        System.out.println("Execution Time:    " + timeTakenMs + " ms");
    }
    
}
