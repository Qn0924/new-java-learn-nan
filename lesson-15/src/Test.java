import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add("Hello");
        for (int i = 0; i < list.size(); i++) {
            int num=(int)list.get(i);
            System.out.println(num+1);
        }
        ArrayList<Integer> list2=new ArrayList();
        list2.add(1);
        //list2.add("Hello");

        ArrayList<String> list3=new ArrayList();
        //list3.add(1);
        list3.add("Hello");
    }
}
