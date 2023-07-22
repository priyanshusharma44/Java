public class TypeConversion {
    public static void main(String[] args) {
        float myfloat = 9.06f;
        int myInt = (int) myfloat; // Manual casting: long to int
        System.out.println("Value of myfloat: "+myfloat);     // Outputs 9.06f
        System.out.println("Value of myInt: "+ myInt);      // Outputs 9
    }
}