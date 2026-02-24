public class zeroday2_2duplicateremoval {
    public static void main(String[] args){
        String s1="abhishek";
        String rev="";
        for(int i=0; i<s1.length(); i++){
            char ch=s1.charAt(i);
            if(rev.indexOf(ch)==-1){
                rev+=ch;
            } 
        }
        System.out.println(rev);
    }
}
