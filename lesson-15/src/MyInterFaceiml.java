//实现接口
public class MyInterFaceiml<T> implements MyInterFace<T>{
    //定义成员变量obj
    private T obj;
    //生成get和set方法
    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
    //生成有参构造
    public MyInterFaceiml(T obj) {
        this.obj = obj;
    }

    //重写接口方法
    @Override
    public T getValue(){
        return this.obj;
    }
}
