package 设计模式.代理模式.动态代理模式;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/3116:05
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
    //真实角色
        Loador loador = new Loador();
        //代理角色
        InvocationHandlertest invocationHandlertest = new InvocationHandlertest();
        //用过代理角色来说实现代理实现代理的接口
        invocationHandlertest.setAction(loador);
        //动态生成的动态代理类
        Action proxy = (Action)invocationHandlertest.getinstance();
        proxy.info();

    }
}
