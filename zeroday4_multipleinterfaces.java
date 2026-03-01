interface A{
    void run();
}
interface B{
    void run();
}
class C implements A,B{
    public void run(){
        System.out.println("runnnnnnnnnnn");
    }
}

public class zeroday4_multipleinterfaces {
    public static void main(String[] args) {
        A s1= new C();
        s1.run();
    }
}
