import java.util.*;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        // Creation of HashSet
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // size of set
        System.out.println("Size of hashSet: "+set.size());

        // print all the hashSet value
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

        // // Search
        // if (set.contains(1)) {
        //     System.out.println("Set contaions 1");
        // }
        // if (!set.contains(6)) {
        //     System.out.println("Set dosenot contains 6");
        // }

    
        // set.remove(1);
        // if (!set.contains(1)) {
        //     System.out.println("Set dosenot contains 1");

        // }

    }

}
