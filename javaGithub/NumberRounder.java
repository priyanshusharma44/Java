//Write a Java program to round a number in n decimal places.
public class NumberRounder {
    public static void main(String[] args) {
        double number = 35.3545;
        int upto = 2;

        double powerOfTen = Math.pow(10, upto);
        double roundedNumber = Math.floor(number * powerOfTen + 0.5) / powerOfTen;
    

        System.out.println("Original Number: " + number);
        System.out.println("Rounded Number: " + roundedNumber);
    }
}
