import java.util.Scanner;
public class ObjClass {
    static Scanner myObj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter name of house: ");
        String hname = myObj.nextLine();
        House h1= new House();
        h1.color = "Red";
        h1.price = 250000;
        
        House h2= new House();
        h2.price = 1234567;
        h2.hName = hname;
        
        h1.printInfo();
        h2.printPrice();
    }
}

class House{
    String color;
    String hName;
    double price;

    void printInfo(){
        System.out.print("\n");
        System.out.print("House color is: "+ color);
        System.out.print("\n");
        System.out.print("House price is: "+ price);
    }
    void printPrice(){
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("House price is: "+ price);
        System.out.print("\n");
        System.out.print("House name is: "+ hName);

    }

}