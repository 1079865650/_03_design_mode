package date_04_07.invocatoin.sub2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuInvocationHandler<T> implements InvocationHandler {
    T target;
    public StuInvocationHandler(T target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" + method.getName() + "方法");
        MonitorUtil.start();
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
