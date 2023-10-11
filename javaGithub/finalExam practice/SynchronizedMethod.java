public class SynchronizedMethod {
    public static void main(String[] args) {
        Table tab = new Table();
        MyThread1 t1 = new MyThread1(tab);
        MyThread2 t2 = new MyThread2(tab);
        t1.start();
        t2.start();
    }
}
class Table{
    public void printTable(int n){
        synchronized(this){
            for(int i=1;i<11;i++){
                System.out.println(n+" x "+ i +" = " +n*i);
            }
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(11);
    }
}