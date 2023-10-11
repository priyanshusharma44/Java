
//Example of method overload with constructor.. 

public class MethodOverload {
    MethodOverload(){
        System.out.println("Constructor called");
    }

    //main method
    public static void main(String[] args){
        add(12,34);//called with 2 parameters....
        add(12.5,34.6);//called with 2 parameters but different data type..
        add(12,34,4);//called with multiple parameter...
    }

    //for sum
    public static void add(int x, int y){
        int z = x+y;
        System.out.println(z);
        MethodOverload call = new MethodOverload();
    }

    //for different datatypes
    public static void add(double x, double y){
        double z = x+y;
        System.out.println(z);
        MethodOverload call = new MethodOverload();
    }


    public static void add(int x, int y, int w){
        int z = x+y+w;
        System.out.println(z);
        MethodOverload call = new MethodOverload();
    }
}
