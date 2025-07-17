package functions.Assignment;

public class Assignment {

    // Qurestion 1 Write a Java method to compute the average of three numbers
    public static int average(float a, float b, float c) {
        int avg = (int) ((a + b + c) / 3); // Correct type casting
        return avg;
    }

    // Qurestion 2 Write a Java method to check even or odd
    public static void EvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }

    // Question 3 Write a Java method to check palindrom
    public static void palindrom(int num) {
        int mynum = num;
        int revnum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            revnum = revnum * 10 + lastdigit;
            num = num / 10;
        }
        if (revnum == mynum) {
            System.out.println(mynum + " is a palindrom num");
        } else {
            System.out.println(mynum + " is not a palindrom num");
        }
    }

    // Question 4 Write a Java method to compute the su of the digit in an integer
    public static void CountInt(int n) {
        int orignalNum = n;
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum += lastdigit;
            n = n / 10;
        }
        System.out.println("Sum of digits in " + orignalNum + " is: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Average of three numbers: " + average(5, 6, 7));
        EvenOdd(6);
        palindrom(321);
        CountInt(1234);
    }
}
