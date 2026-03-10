public class zeroday6_DSA3 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int sum=0;
        int []arr1= new int[5];
        for(int i=0; i<arr.length-1; i++){
            sum+=arr[i];
            arr1[i]=sum;
        }
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]+ "  ");
        }
    }
}
