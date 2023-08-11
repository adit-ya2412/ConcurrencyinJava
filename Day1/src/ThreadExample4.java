public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("Lambda running");
            System.out.println("Lambda Finished");
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
//Lambda expression