public class Problems {
    // Question 1
    // Check if a number is Power of 2 or not
    public static boolean PowerOfTowOrNot(int n) {
        return (n & (n - 1)) == 0;
    }

    // Question 2
    // Count set Bits in a Number
    public static int countSetBits(int n){
        int count = 0;
        while ( n > 0) {
            if((n & 1) != 0){ // check LSB
                count++;
            }
            n = n >> 1;
            
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println(PowerOfTowOrNot(15));
        System.out.println(countSetBits(15));

    }

}
