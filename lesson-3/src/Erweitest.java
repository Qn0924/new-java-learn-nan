public class Erweitest {
    public static void main(String[] args) {
        int arr[][]=new int[3][6];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("----第"+(i+1)+"层柜子----");
            for(int j=0;j<arr[i].length;j++){
            int num=(i+1)*(j+1);
                System.out.println("第"+(j+1)+"个格挡鸡蛋数为："+num);
                sum+=num;
            }
        }
        System.out.println("鸡蛋的总数为："+sum);
    }
}
