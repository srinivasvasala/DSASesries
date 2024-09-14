package Maps;

import java.util.HashMap;
import java.util.Map;

public class findMostRepeated {
   private static Map.Entry<Integer,Integer> mostrep(int []arr){

        if(arr.length==0){
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();

        int res=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])>maxCount){
                res=arr[i];
                maxCount=map.get(arr[i]);
            }
        }
        return Map.entry(res,maxCount);

    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,3,8,3,1,3,4,5,3,7,8,9};
        System.out.println(mostrep(arr));
    }
}
