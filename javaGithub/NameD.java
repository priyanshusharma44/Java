import java.util.Scanner;
public class NameD {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name: ");
            String num = sc.nextLine();
            System.out.println("The name you typed is "+num);
            System.out.println();
            System.out.println("Enter Number:");
            int n=sc.nextInt();
            System.out.println("The Number You Typed Is :"+n);
            System.out.println();
            System.out.println("Enter Float:");
            float f=sc.nextFloat();
            System.out.println("The Float Number You Typed Is :"+f);
            System.out.println();
            System.out.println("Enter Double Number:");
            double s=sc.nextDouble();
            System.out.println("The Double Number You Typed Is :"+s);
            
    }
}