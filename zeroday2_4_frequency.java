public class zeroday2_4_frequency {
    public static void main(String[] args) {
        String s1= "programming";
        char ch='g';
        int count =0;

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)==ch){
                count++;
            }
        }
     System.out.println(count);
    }
}
