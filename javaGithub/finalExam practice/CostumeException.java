import java.util.*;
public class CostumeException {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("Enter first number: ");
            int a = s.nextInt();
            System.out.println("Enter second number: ");
            int b = s.nextInt();
            if(a==0||b==0){
                throw new MyException();
            }
            else
                System.out.println(a*b);
        }
        catch(Exception e){}
    }
}

class MyException extends Exception{
    MyException(){
        System.out.println("please do not enter 0");
    }
}
