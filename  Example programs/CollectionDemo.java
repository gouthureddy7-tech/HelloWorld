import java.util.ArrayList;
public class CollectionDemo {
      
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add("deepak");

        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");

        System.out.println(al2);

        al.addAll(al2);

        System.out.println(al);
        
       
    }
}

