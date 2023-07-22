
class MinBalanceException extends Exception{
    public MinBalanceException()
    {
        System.out.println("Balance Is Low");
    }
}

public class UserDefinedExample{
    
    public static void main(String[]args)
    {
        
        try
        {
        int acc[]={100,101,102,103,104,105};// input
        double balance[]={980,565,5656,54656,565.67};
        for(int i=0;i<5;i++)
        {
            System.out.println("Acc No:"+acc[i] + ""+"Balance:" +balance[i]);
            
            if(balance[i]<10000)
            {
                throw new MinBalanceException(); //throw user defined exception 
            }
        }
        
        }catch (MinBalanceException e)
        {
            System.out.println("exception Caught");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}