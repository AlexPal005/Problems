package Task8;

public class Starter implements Runnable{
    private ReentrantLockImplement locker;
    public Starter(ReentrantLockImplement locker){
        this.locker = locker;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()   + " Wait...");
        locker.lock();
        System.out.println(Thread.currentThread().getName()   + " Has got a lock...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()
                +" Has released the lock.");
        locker.unlock();

    }
}
