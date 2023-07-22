//Write a Java program to generate Calculator Using Switch Case....
 import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first nummber: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second nummber: ");
        int num2 = sc.nextInt();
        System.out.println(" WHich Operator You Wanna Use");
        int choice=sc.next().charAt(0);
    
    switch(choice)
    {
      case '+':
          {
           int sum=0;
          sum=num1+num2;
          System.out.println("The Sum is :"+sum);
          break;
         }
      case '-':
          {
              int sub=0;
              sub=num1-num2;
              System.out.println("The Subtraction is :"+sub);
              break;
          }
      case '/':
          {
              int divide=0;
              divide=num1/num2;
              System.out.println("The division is :"+divide);
              break;
          }
      case '*':
          {
              int multiply=0;
              multiply=num1*num2;
              System.out.println("The multiple is :"+multiply);
              break;
          }
          default:
              {
              System.out.println("Error");
              break;
              }
    }
}  

}
