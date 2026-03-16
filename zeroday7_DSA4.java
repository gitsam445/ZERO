//write a program which will take a string as input from user and print maximum vowel count in the substring of size k.
public class zeroday7_DSA4 {
    public static void main(String[] args){
        String str="abciiidef";
        int k=3;
        int maxVowelCount=0;
        for(int i=0;i<=str.length()-k;i++){
            String substring=str.substring(i,i+k);
            int vowelCount=countVowels(substring);
            if(vowelCount>maxVowelCount){
                maxVowelCount=vowelCount;
            }
        }
        System.out.println(maxVowelCount);
    }
    public static int countVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        return count;
    }
}
