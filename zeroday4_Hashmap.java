import java.util.*;

public class zeroday4_Hashmap {
    public static void main(String[] args){
        // HashMap<Integer,Integer>map= new HashMap<>();
        // map.put(0,10);
        // map.put(1,20);
        // map.put(2,30);
        // // System.out.println(map);
        // System.out.println(map.get(0));
        // // System.out.println(map.containsKey(2));
        // System.out.println(map.getOrDefault(4,20));

        String str= "hello";
        HashMap<Character, Integer>map= new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(map, 0)+1);
        }
        System.out.println(map);
    }
}
