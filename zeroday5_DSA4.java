public class zeroday5_DSA4 {
    public static void main(String[] args){
        int [] arr= {1,3,5,7,10,12};
        int L=0;
        int R=arr.length-1;
        int target= 15;
        while(L<=R){
            if(arr[L]+arr[R]==target){
                System.out.println("Present");
                return;
            }else if(arr[L]+arr[R]>target){
                R--;
            }else{
                L++;
            }
       
        }System.out.println("not present");
    } 
}