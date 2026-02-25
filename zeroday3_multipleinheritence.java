class A{
    String color="green";
    void print(){
        System.out.println("green");
    }
}
class B extends A{
    String color="red";
    void print(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class zeroday3_multipleinheritence {
    public static void main(String[] args) {
        A a=new A();
        a.print();
    }
}
