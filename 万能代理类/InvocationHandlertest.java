package 设计模式.代理模式.万能代理类;



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
//自动生成代理  类似于一个工具类
public class InvocationHandlertest implements InvocationHandler {
    private Object target;

    public void setAction(Object target) {
        this.target = target;
    }
    //得到代理类
    public  Object getinstance(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces() , this);
    }
    //处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始调用invoke方法");
//        seeHose();
        Object invoke = method.invoke(target, args);
//        free();
        System.out.println("结束调用voke方法");
        return invoke;
    }
//    public  void seeHose(){
//        System.out.println("zhongjie lead see house!");
//    }
//    public  void free(){
//        System.out.println("for free");
//    }
}
