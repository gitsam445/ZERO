//take an array as an input user and remove all the zeros of the array to the right side of the array
public class zeroday7_DSA1 {

    public static void main(String[] args) {
        int[] arr={1,0,2,7,0,0,4,5};
        int n=arr.length;
        int k=0;
        int [] ans= new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                ans[k++]=arr[i];
            }
        }
        System.out.println("Array after moving zeros to the right:");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}