public class Fangfa {
    public int test1(int num1,int num2){
        int num=num1+num2;
        return num;
    }
    public void test2(int num1,int num2){
        int num=num1+num2;
    }
    //任意参数列表
    public int test3(int... nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    //若是想要把参数类型改为任意的可用object
    public int test4(Object... nums){
        int sum=0;
        return sum;
    }
    public static void main(String[] args) {
        Fangfa f=new Fangfa();
        int x=f.test3(1,2,3);
        System.out.println(x);
        System.out.println(f.test4(1,2,3,"字符串",1.2,new Exception()));
    }
    //同理数组也可未必只存同一种类型，可用Object存不同类型-多态
    Object arr[]={1,2,3,"er"};
}
