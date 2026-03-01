interface Animal {
    void run();
}
class dog implements Animal{
    public void run(){
       System.out.println("hii");
    }

}
public class zeroday4_interfaces {
    public static void main(String[] args) {
        Animal s1= new dog();
        s1.run();
    }
}
