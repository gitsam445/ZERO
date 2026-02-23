public class zeroday1_1palindrome{
    public static void main(String[] args) {
        int num= 121;   
        int og = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;    
            rev = rev * 10 + digit; 
            num = num / 10;        
        }

        if (og == rev) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is NOT");
        }
    }
}
