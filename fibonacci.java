public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this to the number of terms you want in the Fibonacci sequence
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.println("Fibonacci Sequence (First " + n + " terms):");
        System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }
    }
}
