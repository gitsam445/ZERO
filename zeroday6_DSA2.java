public class zeroday6_DSA2 {
    public static void main(String[] args) {
        int[] arr = {5,7,6,7,4};
        int k=3;
        int x=20;

        int sum=0;
        int count =0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        if(sum == x){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum += arr[i]-arr[i-k];
            if(sum == x){
                count++;
            }
        }
        System.out.println(count);
    }
}
