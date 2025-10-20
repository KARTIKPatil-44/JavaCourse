import java.util.*;
public class hashMap{
    public static void main(String args[]){
        //  Creation of HsahMap Students(keys), rollno(values)
        HashMap<String,Integer> map = new HashMap<>();

        // Insertion
        map.put("Kartik", 408);
        map.put("Manjit", 409);
        map.put("Manoj", 411);

        System.out.println(map);
        
        map.put("Kartik", 414);
        map.put("Ajeet", 420);
        System.out.println(map);

        // Search / lookup for key 
        if(map.containsKey("Arun")){
            System.out.println("Key exists in the map");
        }else{
            System.out.println("Key dosent exists in the map");
        }
        // Search / lookup for value
        System.out.println(map.get("Kartik"));
        System.err.println(map.get("arun"));

        // Iteration  using EntrySet
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // Iteration using Set
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+ map.get(key));
        }

        map.remove("Kartik");
        System.out.println(map);

    }
}