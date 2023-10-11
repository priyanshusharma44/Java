class MyThread1 extends Thread{
    public void run(){
        System.out.println("I am thread 1");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("I am thread 2");
    }
}
class MyThread3 extends Thread{
    public void run(){
        System.out.println("I am thread 3");
    }
}

public class ThreadInJava{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t1.start();  
        t2.start();
        t3.start();  
    }
}