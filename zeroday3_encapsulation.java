// class Atm {
//     private int paisa;

//     public Atm(int r) {
//         this.paisa = r;
//     }

//     public int getter(int a) {
//         return paisa;
//     }
// }

class BankAccount{
    private int balance;

    public BankAccount(int r){
        this.balance =r ;
    }

    public int getter(int a){
        return balance;
    }
}

public class zeroday3_encapsulation {
    public static void main(String[] args) {
        // Atm s1 = new Atm(100);
        // System.out.println(s1.getter(20));
        BankAccount s1 = new BankAccount(100);
        System.out.print("Balance is: ");
        System.out.print(s1.getter(100));


    }
}
