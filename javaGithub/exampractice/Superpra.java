// package exampractice;
public class Superpra {
    public static void main(String[] args) {
        // Parent p1 = new Parent();
        // p1.parentMethod();
        Child c1 = new Child();
        c1.parentMethod();
    }
}

class Parent{
    void parentMethod(){
        System.out.println("I called parent method");
    }
}

class Child extends Parent{
    void childMethod(){
        super.parentMethod();
    }
}

