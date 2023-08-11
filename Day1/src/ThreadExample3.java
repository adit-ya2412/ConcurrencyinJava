public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable(){
            @Override
            public void run(){
                System.out.println("Runnable Running");
                System.out.println("Runnable Finished");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
//Anynomous function