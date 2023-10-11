class DeathLock {
    public static Object resource1 = new Object();
    public static Object resource2 = new Object();
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }


private static class MyThread1 extends Thread{
    public void run(){
        synchronized(resource1){
            System.out.println("Thread1: Holding resource1");
            try{
                Thread.sleep(100);
            }catch(Exception e){}
            System.out.println("Thread1: Wating for resourse2");
            synchronized(resource2){
                System.out.println("Thread2: Holding resource 1 and 2");
            }
        }
    }
}

private static class MyThread2 extends Thread{
    public void run(){
        synchronized(resource2){
            System.out.println("Thread2: Holding resource2");
            try{
                Thread.sleep(100);
            }catch(Exception e){}
            System.out.println("Thread2: Wating for resourse1");
            synchronized(resource1){
                System.out.println("Thread1: Holding resource 1 and 2");
            }
        }
    }
}
}