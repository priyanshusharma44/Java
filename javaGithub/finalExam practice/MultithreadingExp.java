public class MultithreadingExp {
    public static void main(String[] args) throws InterruptedException{
        A t = new A();
        t.start();

        for(int i = 0; i<5;i++){
            System.out.println("Basnet");
            Thread.sleep(1000);
        }
    }    
}
class A extends Thread {
    public void run() {
        for(int i = 0; i<5;i++){
            System.out.println("Sagun");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}