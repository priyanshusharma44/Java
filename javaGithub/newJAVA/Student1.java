public class Student1 {
    public static void main(String[] args) {
        Parent p1= new Parent();
        Child c1 = new Child();
        p1.printInfo();
        // c1.printInfo1();
        
        c1.printInfo();
}}
class Parent{
    void printInfo()
    {
        System.out.println("This is Parent Class");
    }

}

class Child extends Parent{
    void printInfo()
    {
        System.out.println("This is child Class");
    }
}
