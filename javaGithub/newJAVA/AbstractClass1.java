/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "this is second subclass" respectively. Call the methods 'message' by creating  the object for each sub class.*/

public class AbstractClass1 {
    public static void main(String[] args) {
        Parent s1 = new child1();
        s1.message();
        Parent s2 = new child2();
        s2.message();
    }
}

abstract class Parent{
    abstract void message();
}

class child1 extends Parent{
    void message(){
        System.out.println("This is the first subclass");
    }
}

class child2 extends Parent{
    void message(){
        System.out.println("This is the Second subclass");
    }
}