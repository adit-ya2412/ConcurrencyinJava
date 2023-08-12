public class ThreadExample {
    public static void main(String[] args) {

        //four ways to do specify what threads should do
        Mythread mythread=new Mythread();
        mythread.start();
    }
    public static class Mythread extends Thread{
        public void run(){
            System.out.println("My thread is running");
            System.out.println("My thread is finished");
        }
    }

}
//Extending the Thread Class
