//write a program which will shift even and non negative number to the left side of the array
public class zeroday7_DSA2 {
    public static void main(String[] args) {
        int [] arr= {3,-4,2,5,-6,8};
        int n=arr.length;
        int k=0;
        int [] ans= new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]>=0 && arr[i]%2==0){
                ans[k++]=arr[i];
            }
        }
        System.out.println("Array after shifting even and non-negative numbers to the left:");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
