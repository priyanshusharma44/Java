public class MultipleInheritance implements A,B{
    public void show(){
        System.out.println("I am A's overrided method");
    }
    public void display(){
        System.out.println("I am B's overridded method.");
    }
    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.show();
        m.display();
    }
}
interface A{
    void show();
}
interface B{
    void display();
}

