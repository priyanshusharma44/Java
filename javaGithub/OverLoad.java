class A{
    public int A(int x, int y){
        
        return x+y;
    }
    public double A(double a, double b){
        
        int m;
        if(a>b)
        return a;
        else
        return b;
        
    }
    
    
}
public class OverLoad{
    public static void main(String[]args){
        A ree=new A();
        int result1=ree.A(10,12);
        System.out.println(+result1);
        
        A mm=new A();
        double result2=ree.A(10.2,12.2);
        System.out.println(result2);
      
        
        
        
        
    }
}