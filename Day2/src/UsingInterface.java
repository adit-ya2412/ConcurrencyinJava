public class UsingInterface {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnerinterface(),"firstthread");
        Thread t2=new Thread(new Runnerinterface(),"SecondThread");
        t1.start();
        t2.start();

    }

}
class Runnerinterface implements Runnable{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("Hello "+i +"From the "+Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
