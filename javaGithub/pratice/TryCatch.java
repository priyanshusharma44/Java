import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws MyException {
        TryCatch ob1 = new TryCatch();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = myObj.nextInt();
        System.out.println("Enter the value of p: ");
        int p = myObj.nextInt();
        try{
            if((n<=0)||(p<=0)){
                throw new MyException();
            }
            else{
                System.out.println(ob1.power(n,p));
            }
        }
        catch(ArithmeticException ari){
            System.out.println("Enter valid Number..");
        }
        // catch(MyException exp){
        //     System.out.println(ob1.power(1, 1));
        // }
    }

    long power(int n, int p){
        return n*p;
    }
}
class MyException extends Exception{
    MyException(){
        System.out.println("Enter positive number..");
    }
}

