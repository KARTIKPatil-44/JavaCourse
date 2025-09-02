public class Bit_Operations {
    // Get ith bit
    public static int GetithBit(int n, int i) {
        int bitmask = (1 << i);
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    // Set ith bit
    public static int SetithBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // Clear ith bit
    public static int ClearithBit(int n, int i) {
        int bitmask = ~(i << 1);
        return n & bitmask;
    }

    // Update ith bit
    public static int updateithBit(int n, int i, int newBit) {
        // Approch 1

        // if(newBit == 0){
        // return ClearithBit(n, i);
        // }else{
        // return SetithBit(n,i);
        // }

        // Approch 2

        // step 1 clear bit
        n = ClearithBit(n, i);

        int bitmask = newBit << i;
        return n | bitmask;
    }

    // Clear Last ith bit
    public static int clearLastithBit(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    
    //Clear range of bits
    public static int clearRangeOfBits(int n, int i , int j) {
        int a = ((~0) << (j+1));
        int b = (1 << i)-1;
        int bitmask = a | b;
        return n & bitmask;

    }
    public static void main(String[] args) {
        // System.out.println(GetithBit(10, 3));
        // System.out.println(SetithBit(10,2));
        // System.out.println(ClearithBit(10, 1));
        // System.out.println(updateithBit(10, 2, 1));
        // System.out.println(clearLastithBit(15, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));

    }
}