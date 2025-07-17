import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Type Conversion / Implicit Conversion
        // float number = 99.99f;
        // int number2 = (int) number;
        // System.out.println(number2);

        // Type casting / explicite Coversion
        char ch ='a';
        int nums = ch;
        char ch2 ='b';
        int nums2 = ch2;
        System.out.println(nums);
        System.out.println(nums2);



        sc.close();
    }
    
}
