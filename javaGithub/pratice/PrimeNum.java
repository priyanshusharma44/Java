import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = obj.nextInt();
        int x =2, i;
        while (n!=0) {
            for(i = 2;i < x;i++)
                if(x%i==0)
                   break;
            if(i==x){
                System.out.println(x);
                n--;
            }
            x++;

        }
    }
}
