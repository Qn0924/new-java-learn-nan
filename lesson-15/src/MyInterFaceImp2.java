//直接提供实现接口具体数据类型
public class MyInterFaceImp2 implements MyInterFace<String> {
    //定义成员变量
    public String obj;
    //生成get和set方法
    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }
    //生成有参构造
    public MyInterFaceImp2(String obj) {
        this.obj = obj;
    }

    //重写接口抽象方法
    @Override
    public String getValue() {
        return this.obj;
    }
}
