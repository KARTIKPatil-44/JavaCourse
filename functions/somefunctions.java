package functions;

public class somefunctions {
    // Function to print helloworld
    public static void printHello() {
        System.out.println("hello world");

    }

    // Function to print sum of two number and also
    // we r seeing the method overloding using parameters
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Function to print sum of two number and also
    // we r seeing the method overloding using datatypes
    public static float sum(float num1, float num2) {
        return num1 + num2;
    }

    // Function to multiply two number
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;

    }

    // Function to calculate Factorial of number n (n!)
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // Fucntion to calculate the BinomialCofficient
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_n_r);
        return binCoeff;
    }

    // Fucntion to check the numberis prime
    public static boolean isPrime(int n) {
        // corner cases
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // completely dividing then not prime number
            }
        }
        return true;
    }

    // Fucntion to print the primes in range
    public static void primeInRange(int m) {
        for (int i = 2; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Function to convert binnary number to decimal number
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    // Function to convert Decimal number to binary number
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binnary of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        // System.out.println("Sum: " + sum(10, 5));
        // System.out.println("Sum (Overloaded_parameters) : " + sum(10, 5, 3));
        // System.out.println("sum(Overloaded_datatypes) : " + sum(3.2f, 4.8f));
        // System.out.println("Product: " + multiply(3, 4));
        // System.out.println("Factorial: " + factorial(5));
        // System.out.println("Binomial Coefficient: " + binCoeff(5, 2));
        // System.out.println("Check the number is Prime: " + isPrime(5));
        // System.out.println("Print the prime in range: ");
        binToDec(101);
        decToBin(5);
        // primeInRange(20);

    }
}
