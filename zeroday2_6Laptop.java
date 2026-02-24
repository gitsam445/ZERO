public class zeroday2_6Laptop{
    String brand;
    int ram;
    int price;

   void s1(String brand, int ram , int price){
        this.brand= brand;
        this.ram=ram;
        this.price=price;
    }
    void displayDetails(){
        System.out.println("brand: "+ brand);
        System.out.println("ram: "+ram);
        System.out.println("price: "+price);
    }

    public static void main(String[] args) {
        zeroday2_6Laptop s1=new s1("dell",12,65000);
        s1.displayDetails();
    }
}
