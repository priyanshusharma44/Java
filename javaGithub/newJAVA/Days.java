//program to print days using switch....

import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter days:");
        String day = myObj.nextLine();
        switch(day){
            case "sun":
                System.out.println("Sunday");
                break;
            case "mon":
                System.out.println("Monday");
                break;
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thu":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            case "sat":
                System.out.println("Saturday");
                break;
        }
    }
}
