import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        //数组转字符串拼出来用数组里面的方法Arrays.toString()--是Arrays类中的一个方法
        //Arrays是一个用来操作数组的类
        System.out.println(Arrays.toString(arr));
        for (int zuhe : arr) {
            System.out.println(zuhe);
        }
    }
}
