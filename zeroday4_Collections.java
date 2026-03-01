import java.util.ArrayList;
public class zeroday4_Collections {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.get(0));
        list.set(0,100);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(5));
    }
}
