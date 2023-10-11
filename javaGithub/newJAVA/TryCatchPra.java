import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class MyException extends Exception{
    public MyException(){
        System.out.println("Please enter positive number");
    }
}
class NewClass{
    long result(int p, int t, int r){
        int intre = (p*t*r)/100;
        return intre;
    }
}

public class TryCatchPra {
    public static void main(String[] args) throws MyException{
        Scanner obj = new Scanner(System.in);
        NewClass res = new NewClass();
        try{
            System.out.println("Enter principle: ");
            int p = obj.nextInt();
            System.out.println("Enter rate: ");
            int r = obj.nextInt();
            System.out.println("Enter time: ");
            int t = obj.nextInt();
            long intre = res.result(p, t, r);
            if((p<0)||(r<0)||(t<0)){
                throw new MyException();
            }
            else{
                System.out.println("Interest = "+ intre);

            }
        }
        catch(NullPointerException nullPointer){
            System.out.println(res.result(100,2,12));
        }
        catch(ArithmeticException arith){
            System.out.println("Please enter valid number.");
        }
        catch(MyException e){
            System.out.println(res.result(1200,3,12));
        }
    }
}

