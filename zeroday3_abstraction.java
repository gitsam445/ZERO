abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("woof");
    }
}

public class zeroday3_abstraction {
    public static void main(String[] args) {
        Animal s1= new Dog();
        // Dog s1= new Dog(); this is right too      
        s1.sound();
    }
}
