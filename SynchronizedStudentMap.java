import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class SynchronizedStudentMap {
    static final int THREAD_COUNT = 3;
    static final int RECORDS_PER_THREAD = 100;

    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        int expectedEntries = THREAD_COUNT * RECORDS_PER_THREAD;
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            final int threadId = i;
            executor.submit(() -> {
                for (int j = 0; j < RECORDS_PER_THREAD; j++) {
                    String key = "student_" + threadId + "_" + j;
                    synchronizedMap.put(key, threadId * RECORDS_PER_THREAD + j);
                }
            });
        }

    }
}
