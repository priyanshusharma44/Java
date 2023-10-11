public class ClassWork {
    public static void main(String[] args) {
        long result= power(-2,10);
        System.out.println(result);
    }
    static long power(int n,int p){
        if((n<0)||(p<0)){
            throw new ArithmeticException("n or p should not be negative");
        }
        else if((n==0)||(p==0)){
            throw new ArithmeticException("n or p should not be zero");
        }
        else{
            return n*p;
        }
    }
}