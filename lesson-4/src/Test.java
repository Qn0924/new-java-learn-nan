public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.method(10);
        test.method();
    }
    public void method(){
        System.out.println("没有参数");
    }
    public void method(int num){
        System.out.println("参数为"+num);
    }
}
