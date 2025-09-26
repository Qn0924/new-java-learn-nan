public class Erwei {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int a1[]={1,2,3};
        int a2[]={4,5,6,7};
        int a3[]={8,9,10,11,12};
        a[0]=a1;
        a[1]=a2;
        a[2]=a3;
        System.out.println(a);
        //二维数组第二维可以不用指定长度因为一维存放的是数组但是如果要用下述情况赋值就是访问
        // 到了第二维超过第二维长度就会报错但是上面那种就是一维赋值存放地址并不会超
        int arr[][]=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[1][3]=21;
//        arr[2][0]=7;
//        arr[2][1]=8;
//        arr[2][2]=9;
        System.out.println(arr);
    }
}
