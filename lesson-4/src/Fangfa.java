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

    public static void main(String[] args) {
        Fangfa f=new Fangfa();
        int x=f.test3(1,2,3);
        System.out.println(x);
    }
}
