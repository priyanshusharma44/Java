public class ConMetOverloading {
    public ConMetOverloading(int a,int b){
        int res = a+b;
        System.out.println(a+b);
    }
    public ConMetOverloading(int a,int b,int c){
        int res = a+b+c;
        System.out.println(res);
    }
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10.5,20.5));
        ConMetOverloading obj1 = new ConMetOverloading(2,3);
        ConMetOverloading obj2 = new ConMetOverloading(2,3,5);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static double sum(double a,double b){
        return a+b;
    }
}
