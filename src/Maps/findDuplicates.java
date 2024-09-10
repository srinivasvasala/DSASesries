package Maps;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {
public static Set<Integer> findDuplicate(int[] arr){
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> duplicates = new HashSet<>();
    for(int i=0;i<arr.length;i++){
        if(set.contains(arr[i])){
            set.add(arr[i]);
        }else{
            set.add(arr[i]);
        }
    }
    return duplicates;
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,1,3,4,5,6,7,8,9};
        System.out.println(findDuplicate(arr));
    }
}
