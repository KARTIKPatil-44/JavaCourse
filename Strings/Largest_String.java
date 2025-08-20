public class Largest_String {
// time complexity O(x*n) wherer x is length of each leter  and n is n number of strings
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
