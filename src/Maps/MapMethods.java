package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        //put(key,value) method → insert a key value pair into HashMap.If key already exists then old value will be replaced with new value.
        map.put("A",1); // Adds the pair ("A", 1) to the map
       // map.put("A",2); // Updates the value for "A" to 2,
        //Returns: The previous value associated with the key, or null if there was no mapping for the key.

        //get(object key) method → returns the value associated with the key
        //Returns: if key exists, returns the value associated with the key, else returns null
        System.out.println(map.get("A"));

        //containsKey(object key) method → returns true if key exists
        //Returns: true if the key exists in the map, false otherwise
        System.out.println(map.containsKey("A"));

        //containsValue(object value) method → returns true if value exists
        //Returns: true if the value exists in the map, false otherwise
        System.out.println(map.containsValue(1));

        //isEmpty() method → returns true if map is empty
        //Returns: true if the map is empty, false otherwise
        System.out.println(map.isEmpty());

        //keySet() method → returns a Set view of the keys contained in the map
        //Returns: a Set view of the keys contained in the map
        System.out.println(map.keySet());

        //equals(Object object) method → returns true if the map is equal to the given object
        //Returns: true if the map is equal to the given object, false otherwise
        System.out.println(map.equals(map));

        //toString() method → returns a string representation of the map
        //Returns: a string representation of the map
        System.out.println(map.toString());

        //size() method → returns the number of key-value mappings in the map
        //Returns: the number of key-value mappings in the map
        System.out.println(map.size());

        //clear() method → removes all key-value mappings from the map
        //Returns: void
        map.clear();
        System.out.println(map);

        System.out.println(map.isEmpty());

        //putIfAbsent(key, value) method → inserts the key value pair if the key is not already present in the map
        //Returns: the value associated with the key, or the new value if the key was not present in the map
        map.putIfAbsent("A", 1);
        System.out.println(map);

        //getOrDefault(Object key, V defaultValue) method → returns the value associated with the key, or the default value if the key is not present in the map
        //Returns: the value associated with the key, or the default value if the key is not present in the map
        System.out.println(map.getOrDefault("A", 0));

        //remove(Object key) method → removes the key value pair from the map
        //Returns: the value associated with the key, or null if the key was not present in the map
        map.remove("A");
        System.out.println(map);

        //compute(key, BiFunction remappingFunction) method → computes the new value associated with the key using the given remapping function
        //Returns: the new value associated with the key, or null if the key was not present in the map
        map.compute("A", (key, value) -> value == null ? 1 : value + 1);
        System.out.println(map);







    }
}
