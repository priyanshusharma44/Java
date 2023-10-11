//program to find if the given number is positive or not

import java.util.Scanner;
class PosOrNeg{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = myObj.nextInt();
        if(n>0){
            System.out.println((n)+" is positive number.");
        }
        else
            System.out.println((n)+" is negative number.");

    }
}