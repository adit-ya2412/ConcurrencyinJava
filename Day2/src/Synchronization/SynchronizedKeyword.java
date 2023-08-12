package Synchronization;

public class SynchronizedKeyword {
    private int count=0;
public  synchronized void increment(){
    count++;
}
    public static void main(String[] args) throws InterruptedException {
        SynchronizedKeyword sk1=new SynchronizedKeyword();
        sk1.doWork();
    }
    public void doWork() throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    increment();
                    System.out.println("Thread with name"+Thread.currentThread()+"Changed the value of Count");
                }
            }
        },"FirstOne");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    increment();
                    System.out.println("Thread with name"+Thread.currentThread()+"Changed the value of Count");
                }
            }
        },"SecondOne");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }
}

