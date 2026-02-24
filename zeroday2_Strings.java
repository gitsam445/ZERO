class zeroday2_Strings_palindrome{
    public static void main(String[] args){
        // String s1= "hello";
        // String s2= "hello";
        // int a=5;
        // int b=5;
        // System.out.println(s1==s2);
        // System.out.println(a==b);

        // String s1="hello";
        // System.out.println(s1.charAt(0));
        // String s2="";
        // s2=s1+"hiii";

        // for(int i=0; i<s1.length; i++){
        //     System.out.println(s1.charAt(i));
        // }

        String s1= "racecar";
        String rev="";
        for(int i=s1.length()-1; i>=0; i--){
            rev+=s1.charAt(i);
        }

        if(s1.equals(rev)){
            System.out.println("yes");
        }
        else{
            System.out.println("not");
        }


    }
}