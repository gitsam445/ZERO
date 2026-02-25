class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add1(int a, int b, int c){
        return a+b+c;
    }
    int add2(int a, int b, int c){
        return a+b+c;
    }
}
public class zeroday3_runtimepolymorph_overloading {
    public static void main(String[]args){
        Calculator calc=new Calculator();

        System.out.println(calc.add(5,10));
        System.out.println(calc.add1(1,2,3));
        System.out.println(calc.add2(2,5,3));
    }
}
