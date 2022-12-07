package Task8;

public class Main {
    public static void main(String[] args) {
        ReentrantLockImplement locker = new ReentrantLockImplement();
        Starter starter = new Starter(locker);

        for (int i = 1; i < 5; i++){
            new Thread(starter).start();
        }
    }
}
