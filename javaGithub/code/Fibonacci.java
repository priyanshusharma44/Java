import java.util.Scanner;
class Temp{
    int fibo(int n){
        if(n==1){
            return (1);
        }
        else if(n==2){
            return (1);
        }
        else
            return (fibo(n-1) + fibo(n-2));
    }
    
}
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        Temp obj = new Temp();
        for (int i = 1; i <=n; i++) {
            System.out.println(obj.fibo(n));
        }
    }
}

 