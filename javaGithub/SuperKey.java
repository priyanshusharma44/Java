class A {
    int i = 10; // Instance variable of class A (parent class)
}

class B extends A {
    int b = 20;

    void show(int i) { // Removed the semicolon (;) after the method declaration
        System.out.println("B's Function Value:"+i); // Prints the local variable i passed as an argument
        System.out.println("B local Value:"+this.i); // Accesses the instance variable i of class B
        System.out.println("The Spuer Value:"+super.i); // Accesses the instance variable i of class A
    }
}

public class SuperKey {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(30);
    }
}
