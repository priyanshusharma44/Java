class TwoAdd{
    
    public int add(int x, int y){
        return x+y;
    }
    public  double add(double a, double b){
        double m;
        if(a>b)
        {
             m=a;
             return m;
        }
        else
        {
            m=b;
            return m;
        }
    }
}

 public class addition{
    public static void main(String[]args){
    TwoAdd a=new TwoAdd();
    TwoAdd b=new TwoAdd();
    int y = a.add(12,2);
    double c= b.add(2.1,1.1);
    System.out.println(y);
       System.out.println(c);
    }
}