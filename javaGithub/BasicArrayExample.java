public class BasicArrayExample {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = new int[5];

        // Assign values to the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access and print the array elements
        System.out.println("Array elements:");
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);
        System.out.println("numbers[3]: " + numbers[3]);
        System.out.println("numbers[4]: " + numbers[4]);

        // Calculate and print the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);
    }
}
