class MyThread1 extends Thread{
    // public void run(int a, int b){
    public void run(){
        int c = 1+2;
        System.out.println(c);
    }
}
class MyThread2 extends Thread{
    public void run(){
        int a = 2-1;
        System.out.println(a);
    }
}
class MyThread3 extends Thread{
    public void run(){
        int a = 2*10;
        System.out.println(a);
    }
}
public class ThreadExp1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        // Thread th1 = new Thread(t2); //use in implements the runable class
        t1.start();
        t2.start();
        t3.start();
    }
}

