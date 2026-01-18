import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    private Object object=null;

    //返回动态代理对象
    public Object bind(Object object){
        this.object=object;
        return Proxy.newProxyInstance(
                MyInvocationHandler.class.getClassLoader(),
                object.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理模式。。。");
        return method.invoke(object,args);

    }
}
