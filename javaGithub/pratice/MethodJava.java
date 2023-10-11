import java.util.Scanner;
public class MethodJava {
    static Scanner myObj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Your name is "+myName());
    }
    static String myName(){
        System.out.print("Enter your name: ");
        String name = myObj.nextLine();
        return name;
    }
}
