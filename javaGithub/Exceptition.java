public class Exceptition{
public static void main(String[] args)
{
    
    try
    {
        
        int value=50/0; //may throw exceptition
    }
     catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    
    try
    {
        int arr[]={10,11,12,13};
        System.out.println("Array:" +arr[4]);
    }
    //handeling the exceptition

    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }
    
    System.out.println("Rest of code");
    
    
}
}