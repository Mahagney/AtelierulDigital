package Concurrent;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantExample {
    private final ReentrantLock lock = new ReentrantLock();
    // ...
    private int i=0;
    public void  m() {
        lock.lock();  // block until condition holds
        try {
            i++;
            if(i<3){
                System.out.println("-"+i);
                m();
            }
            System.out.println(i);
        } finally {
            lock.unlock();
        }
    }
}
