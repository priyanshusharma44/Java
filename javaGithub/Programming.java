public class Programming {

    public static void main(String[] args) {
    add(10,30); 
    add(10,20,30); 
    }

    public static void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is "+sum);
    }

    public  static void add(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        System.out.println("The sum is "+sum);
    }
}