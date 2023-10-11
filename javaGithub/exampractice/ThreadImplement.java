class MyThread1 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ma no 1 thread ho hai");
        }
    }
}

// class MyThread2 implements Runnable{

// }

public class ThreadImplement {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread th = new Thread(t1);
        th.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ma main thread ho hai");
        }
    }
}
