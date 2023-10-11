import java.lang.*;

class TotalFees extends Thread{
    double total = 0;
    @Override
    public void run(){
        synchronized(this){
            for(int i = 1; 1<=10; i++){
                total = total+1000;
            }
            // notify();
        }
    }
}

public class ThreadExp3 {
    public static void main(String[] args)throws InterruptedException {
        TotalFees totalFees = new TotalFees();
        totalFees.start();
        synchronized(totalFees){
            totalFees.wait();
            System.out.println("The total fees is: "+ totalFees.total);
        }
    }
}
