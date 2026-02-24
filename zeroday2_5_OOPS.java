class Student{

    int rollN;
    String name;

    public Student(int rollN, String name){
        // System.out.println("hiii");
        this.rollN=rollN;
        this.name=name;
    }
    void details(){
        System.out.println(rollN+" "+name);
    }
}
public class zeroday2_5_OOPS {
   public static void main(String[] args) {
    Student s1= new Student();
    Student s2= new Student();
    s1.details();
    s2.details();


   }   
}
