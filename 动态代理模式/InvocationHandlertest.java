package 设计模式.代理模式.动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/3115:31
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
//自动生成代理
public class InvocationHandlertest implements InvocationHandler {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }
    //得到代理类
    public  Object getinstance(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),action.getClass().getInterfaces() , this);
    }
    //处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHose();
        Object invoke = method.invoke(action, args);
        free();
        return invoke;
    }
    public  void seeHose(){
        System.out.println("zhongjie lead see house!");
    }
    public  void free(){
        System.out.println("for free");
    }
}
