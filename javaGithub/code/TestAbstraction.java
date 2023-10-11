//Program to demonstrate the use-case of Abstract class
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle.");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle.");
    }
}
public class TestAbstraction {
    public static void main(String[] args) {
        // Shape s = new Shape(); we cannot access Shape class
        Shape s = new Circle(); 
        s.draw();
    }
}
