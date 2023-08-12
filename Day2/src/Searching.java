public class Searching {
    public static void main(String[] args) throws InterruptedException {
        int[]arr={20,9,10,13,22,99,70,80,90,1000,20001,3,17};
        System.out.println(linearSearchTime(arr));
        System.out.println(threadSearchTime(arr));
    }
    static long linearSearchTime(int[]arr){
        int targ=20001;
        long start=System.currentTimeMillis();
        long found=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==targ){
                found=System.currentTimeMillis();
                break;
            }
        }
        return found-start;
    }
    static long threadSearchTime(int[]arr) throws InterruptedException {
        int targ=20001;
        long start=System.currentTimeMillis();
        long found=0;
        Thread t1=new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i <6 ; i++) {
                    if (arr[i]==targ){
                       long time=System.currentTimeMillis();
                        System.out.println("Found element in "+(time-start));
                    }
                }
            }
        },"First Thread");

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <6 ; i++) {
                    if (arr[i]==targ){
                        long time=System.currentTimeMillis();
                        System.out.println("Found element in "+(time-start));

                    }
                }
            }
        },"SEcond Thread");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return found;
    }
}
