import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Hello");
        list.add("World");
        System.out.println("添加之前的集合："+list);
        Collections.addAll(list,"Java","JavaSE","JavaME");
        System.out.println("添加之后的集合："+list);
        Collections.reverse(list);
        System.out.println("反转后的集合："+list);
        Collections.swap(list,1,3);
        System.out.println("交换之后的集合："+list);
        Collections.sort(list);
        System.out.println("排序之后都集合"+list);
        int javaME=Collections.binarySearch(list,"JavaME");
        System.out.println("JavME在集合中的下标："+javaME);
        Collections.replaceAll(list,"Java","Coleections");
        System.out.println("替换之后的集合："+list);
        list=new ArrayList();
        Collections.addAll(list,new User(1,"张三"),
                                new User(2,"李四"),
                                new User(3,"王五"));
        System.out.println("添加之后的集合："+list);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1,Object o2){
                User user1=(User) o1;
                User user2=(User) o2;
                if(user1.getId()<user2.getId()){
                    return 1;
                }else if(user1.getId()==user2.getId()){
                    return 0;
                }else{
                return -1;
            }
            }
        });
        System.out.println("排序滞后的集合："+list);
    }
}
