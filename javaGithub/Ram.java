class Computer{
// properties
int id;
String name;
double price;
// methods
void printDetails(){
  System.out.println("ID is "+this.id);
  System.out.println("Name is "+this.name);
  System.out.println("Price is "+this.price);
}

}
// Main class

public class Ram {
  // main method
  public static void main(String[] args) {
     //Creating a object from class Computer
    Computer com1 = new Computer();
    // Assign value to class properties
    com1.id = 1;
    com1.name = "MSI";
    com1.price = 233.0;
    System.out.println(com1.id);
    System.out.println(com1.name);
    System.out.println(com1.price);
  }
}