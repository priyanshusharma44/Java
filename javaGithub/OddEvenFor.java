//Write a Java program to check if the number is odd or even.
public class OddEvenFor {
    public static void main(String[] args) {
      
      int number=100;
      for(int i=1;i<=number;i++)
      {
        if(i%2==0)
        {
            System.out.println(i+":The Number Is Even");
            System.out.println();
        }
        else
        {
            System.out.println(i+":The Number Is Odd");
            System.out.println(); 
        }
      }

    }
}