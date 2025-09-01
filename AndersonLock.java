import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class AndersonLock {
    private final AtomicBoolean[] slots;
    private final int size;
    private final AtomicInteger tail = new AtomicInteger(0);
    private final ThreadLocal<Integer> localSlot = ThreadLocal.withInitial(() -> 0);

    public AndersonLock(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("capacity must be > 0");
        //TODO: Implement 
    }

    public void lock() {
        //TODO: Implement 
    }

    public void unlock() {
        //TODO: Implement 
    }
}
