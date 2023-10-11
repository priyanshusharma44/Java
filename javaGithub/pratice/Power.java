import java.util.Scanner;
public class Power {
    static Scanner myObj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = myObj.nextInt();
        System.out.print("Enter Power: ");
        // char ch = myObj.nextLine().charAt(0);
        int pow = myObj.nextInt();

        double res = Math.pow(n,pow);
        System.out.print("Ans = "+ res);
    }
}
