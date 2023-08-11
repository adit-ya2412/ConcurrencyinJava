public class ThreadExample6 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName+"Running");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(threadName+"Finished");
        };
        Thread thread=new Thread(runnable,"The thread");
        thread.start();
        Thread thread2=new Thread(runnable,"The Thread2");
        thread2.start();
    }
}
