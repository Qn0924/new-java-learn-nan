import java.util.Arrays;
//数组类工具类方法均用Arrays类里面封装的方法
public class Tools {
    public static void main(String[] args) {
        int arr[]={73,80,62,93,96,87};
        int arr2[]={73,80,62,93,96,87};
        int arr3[]={66,55,44,33,22};
        //判断数组是否相等 （相等条件是数组元素和个数均相等）用Arrays.equals
        System.out.println(Arrays.equals(arr,arr2));
        System.out.println(Arrays.equals(arr2,arr3));

        //数组排序 用sort
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //数组填充 即把该数组所有元素变成你想要填充的元素用fill
        Arrays.toString(arr2);
        Arrays.fill(arr2,66);
        System.out.println(Arrays.toString(arr2));

        //数组复制 用copeOf长度可大/小要复制的数组若大多的为0若小只复制要复制的长度
        int arr4[]=Arrays.copyOf(arr3,5);
        System.out.println(Arrays.toString(arr4));

        int arr5[]=Arrays.copyOf(arr3,3);
        System.out.println(Arrays.toString(arr5));

        int arr6[]=Arrays.copyOf(arr3,8);
        System.out.println(Arrays.toString(arr6));

        //查找元素所对应的下标 用binarySearch
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 87));
    }
}
