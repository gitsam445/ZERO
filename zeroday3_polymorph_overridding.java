class Company{
    void regulate(){
        System.out.println("makes decision");
    }
}
class HR extends Company{
    void regulate(){
        System.out.println("HR Hires");
    }
}
class EMP extends Company{
    void regulate(){
        System.out.println("Employee works");
    }
}
public class zeroday3_polymorph_overridding{
    public static void main(String[] args) {
        Company a;
        a=new HR();
        a.regulate();

        a=new EMP();
        a.regulate();
    }
}