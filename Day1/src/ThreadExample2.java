public class ThreadExample2 {
    public static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("My runnable Running");
            System.out.println("My runnable Finished");
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new MyRunnable());
        thread.start();
    }
}
//Implementing using Runnable Interface