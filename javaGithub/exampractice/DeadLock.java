public class DeadLock {
    public static void main(String[] args) {
        
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
        
    }
}

class Thread1 extends Thread{
    final Object resource1 = "This is resource one";
    final Object resource2 = "This is resource two";
    public void run(){
        synchronized(resource1){
            System.out.println("Thread 1: locked resource 1");
            try{
                Thread.sleep(100);
            }catch(Exception e){
                
            }
            synchronized(resource2){
                System.out.println("Thread 1: locked resource 2");
            }
        }
    }
}
class Thread2 extends Thread{
    final Object resource1 = "This is resource one";
    final Object resource2 = "This is resource two";
    public void run(){
        synchronized(resource2){
            System.out.println("Thread 2: locked resource 2");
            try{
                Thread.sleep(100);
            }catch(Exception e){
                
            }
            synchronized(resource1){
                System.out.println("Thread 2: locked resource 1");
            }
        }
    }
}
