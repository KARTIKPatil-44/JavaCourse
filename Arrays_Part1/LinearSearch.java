public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static int Hotel(String menu[], String item) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == item) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        String[] menu = { "dosa", "cole bature", "masaladosa", "samosa" };
        String item = "samosa";

        int index2 = Hotel(menu, item);
        if (index2 == -1) {
            System.out.println("Not found you item");
        } else {
            System.out.println("Item at index: " + index2);
        }

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }

}
