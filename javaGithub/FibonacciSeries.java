public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms to generate

        // First two terms of the Fibonacci series
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a+ " ");

            // Calculate the next term by summing the previous two terms
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
