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

    }
    
}
