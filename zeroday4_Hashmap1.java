import java.util.HashMap;

public class zeroday4_Hashmap1 {
    public static void main(String[] args) {
        int arr[]= {1,3,3,4,5};
        int target= 6;
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i= 0; i<arr.length; i++){
            int D1= target- arr[i];
            if(map.containsKey(D1)){
                System.out.println(map.get(D1)+ " " + i);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("no pair found");
    }
}
