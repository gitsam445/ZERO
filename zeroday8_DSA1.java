public class zeroday8_DSA1 {
    public static void main(String[] args) {
        String s= "mynameissam";
        int k=3;
        int ans=0,cmax=0;
        for(int i=0;i<k;i++){
            if(checkVowel(s.charAt(i))){
                cmax++;
            }
        }
        ans=cmax;
        for(int i=k;i<s.length();i++){
            if(checkVowel(s.charAt(i-k))){
                cmax--;
            }
            if(checkVowel(s.charAt(i))){
                cmax++;
            }
            ans=Math.max(ans,cmax);
        }
        System.out.println("maximum vowel count in the substring of size k is: "+ans);
}
}
