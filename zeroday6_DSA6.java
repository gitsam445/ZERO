//write a program which will rotate an array by 3 elements in the right direction
public class zeroday6_DSA6 {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,7,8};
        int n=arr.length;
        int k=3;
        int [] ans= new int[n];
        for(int i=0; i<n; i++){
            ans[(i+k)%n]=arr[i];
        }
        System.out.println("Rotated array:");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
