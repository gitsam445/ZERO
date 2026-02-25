class Animal{
    void eat(){
        System.out.println("animal eats");
    }
}
class puppy extends Animal{
    void bark(){
        System.out.println("puppy barks");
    }
}
class zeroday3_inheritence{
    public static void main(String[] args) {
        puppy a=new puppy();
        a.eat();
        a.bark();
    }
}