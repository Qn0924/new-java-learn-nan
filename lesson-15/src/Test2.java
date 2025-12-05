public class Test2 {
    public static void main(String[] args) {
        //实例化时间对象
        Time2 <String,Integer,Float> time=new Time2();
        //传时分秒的值
        time.setHour("十点整");
        time.setMin(10);
        time.setS(10.0f);
        //运行查看测试结果
        System.out.println("现在的时间是"+time.getHour()+":"+time.getMin()+":"+time.getS());
    }
}
