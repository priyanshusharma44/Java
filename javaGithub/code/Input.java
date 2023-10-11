//Program to get input from user using scanner and different data type
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = myObj.nextLine();
        System.out.println("Enter class:");
        int c = myObj.nextInt();
        System.out.println("Enter roll no:");
        int roll = myObj.nextInt();
        System.out.println("Enter Sex:");
        myObj.nextLine();
        char adr = myObj.next().charAt(0);
        System.out.println("Enter marks:");
        float mark = myObj.nextFloat();

        System.out.println("\n=======================================\n");
        System.out.println("Name: "+name);
        System.out.println("Class: "+c);
        System.out.println("Roll no: "+roll);
        System.out.println("Sex: "+adr);    
        System.out.println("Marks: "+mark);    
    }
}
