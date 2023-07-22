//Write a java program to create a class Laptop with properties [id, name, ram] and create 3 objects of it and print all details
public class Return {
    public static void main(String[] args) {

        int a =10;
        int b=20;
        int c= 30;
        
          
        System.out.println("The Division is :"+(add( a, b, c))); 
        
    }
    public static int add(int x, int y, int z)
    {
        
        int sum = x+y+z;
       
        return sum;
    }
}