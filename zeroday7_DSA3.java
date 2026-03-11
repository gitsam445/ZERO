//Given an integer array nums, find the subarray with the largest sum and return its sum
public class zeroday7_DSA3 {
    public static void main(String[] args) {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int maxSum=arr[0];
        int currentSum=0;
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println(maxSum);
    }
}
