import java.util.Scanner;
public class LargSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();

        if(a>b && a>c)
            System.out.println("First number is greater: "+a);
        else if(b>c)
            System.out.println("Second number is greater: "+b);
        else 
            System.out.println("Third number is greater: "+c);

    }
}
