public class ThreadBasic {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread t = new Thread(t1);
        t.start();

        for(int i = 1; i<6; i++)
            System.out.println("Sagun");
    }
}
//Thread by extending Thread class........
class MyThread1 extends Thread{
    public void run(){
        try{
            for(int i = 1; i<6; i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch(Exception e){}
    }
}

//Thread by implementing Runnable..........
// class MyThread1 implements Runnable{
//     public void run(){
//         for(int i=1; i<6; i++)
//             System.out.println(i);
//     }
// }