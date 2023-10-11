//program to find Total, percentage, and grade of marks....

import java.util.Scanner;
public class StdResult {
    public static void main(String[] argu){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter marks of SAD:");
            int sad = myObj.nextInt();
            System.out.println("Enter marks of Math:");
            int mat = myObj.nextInt();
            System.out.println("Enter marks of DSA:");
            int dsa = myObj.nextInt();
            System.out.println("Enter marks of JAVA:");
            int java = myObj.nextInt();
            System.out.println("Enter marks of web tech:");
            int web = myObj.nextInt();

            float total = sad+mat+dsa+java+web;
            System.out.println("==================================");
            System.out.println("Total = "+total);
            float per = (total/500)*100;
            System.out.println("Percentage = "+per);
            if (per<25) {
                System.out.println("Your Grade is: F");
            }
            else if(per<45){
                System.out.println("Your Grade is: E");
            }
            else if(per<50){
                System.out.println("Your Grade is: D");
            }
            else if(per<60){
                System.out.println("Your Grade is: C");
            }
            else if(per<80){
                System.out.println("Your Grade is: B");
            }
            else{
                System.out.println("Your Grade is: A");

            } 
    }
}
