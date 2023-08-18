import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class proccessor implements Runnable{
    private int id;
    public proccessor(int id){
        this.id=id;
    }
    public void run(){
        System.out.println("Starting the task number"+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Completed task number"+id);
    }

}
public class App {
    public static void main(String[] args) throws InterruptedException {
//        Worker worker1=new Worker();
//        worker1.main();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for (int i = 0; i <=5 ; i++) {
            executorService.submit(new proccessor(i));
        }
        executorService.shutdown();
        System.out.println("All tasks Submitted");

        executorService.awaitTermination(10, TimeUnit.HOURS);

        System.out.println("All tasks completed");

    }
}
