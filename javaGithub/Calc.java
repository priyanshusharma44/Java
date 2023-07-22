public class Calc{
    
    int i=10;
    int k=10;
    Calc(int i, int j, int k){
        
     int result=100;
     System.out.println("The Result is:"+result);
     System.out.println("Invoke The Add Methods");
    }
    
    public static void main(String[]args){
        Calc cl=new Calc(10,20,30);
        System.out.println(cl.k);
    }
    
    public void sub(){
        System.out.println();
    }
}