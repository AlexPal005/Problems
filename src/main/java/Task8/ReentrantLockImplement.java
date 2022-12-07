package Task8;

public class ReentrantLockImplement {
    private boolean isLockedObject;
    private Object object;
    public ReentrantLockImplement(){
        object = new Object();
        isLockedObject = false;
    }
    public void lock(){
        synchronized (object) {
            while (isLockedObject) {
                try{
                    object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            isLockedObject = true;
        }
    }
    public void unlock() {
        synchronized (object) {
            object.notify();
            isLockedObject = false;
        }
    }
}
