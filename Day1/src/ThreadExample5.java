public class ThreadExample5 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName+"Runnning");
        };
        Thread thread=new Thread(runnable,"The Thread 1");
        thread.start();
        Thread thread2=new Thread(runnable,"The thread 2");
        thread2.start();
    }
}
