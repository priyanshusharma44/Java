public class LabWorkFriday1 {
    
    public static void main(String[] args) {
        Marks a = new A(40,60,80);
        a.getPercentage();
        Marks b = new B(40,60,80,95);
        b.getPercentage();
    }
}

abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    double total;
    A(double mark1, double mark2, double mark3){
        total = mark1+mark2+mark3;
    }
    double getPercentage(){
        double per = (total/300)*100;
        System.out.println("Percentage = "+ per);
        return per;
    }
}
class B extends Marks{
    double total;
    B(double mark1, double mark2, double mark3, double mark4){
         total = mark1+mark2+mark3+mark4;
    }
    double getPercentage(){
        double per = (total/400)*100;
        System.out.println("Percentage = "+ per);
        return per;
    }
}

