package Synchronization;

import java.util.Scanner;

public class Volatiledemo {
    public static void main(String[] args) {
        Proccessor p1=new Proccessor();
        p1.start();
        System.out.println("Press Return to stop....");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        p1.shutDown();

    }
}
class Proccessor extends Thread{
    private volatile boolean running=true;
    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutDown(){
        running=false;
    }
}