import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <String> list2=new ArrayList<>();
        test(list1);
        test(list2);
    }

    public static void test(ArrayList<?> list){
        System.out.println(list);
    }
}
