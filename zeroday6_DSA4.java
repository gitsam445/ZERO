public class zeroday6_DSA4 {
    public static void main(String[] args) {
        int[] arr= {1,7,3,6,5,6};
        int [] left= new int[arr.length];
        int [] right= new int[arr.length];
        int curr_sum=0;
        int ans=0;
        for(int i=0; i<arr.length-1; i++){
            curr_sum+=arr[i];
            left[i]=curr_sum;
        } 
        curr_sum=0;
        for(int i=arr.length-1; i>=0; i--){
            curr_sum+=arr[i];
            right[i]=curr_sum;
        }
        
        for(int i=0; i<arr.length; i++){
           if(left[i]==right[i]){
                ans=1;
                break;
           }
        }
        System.out.println(ans);
    } 
}
