package 设计模式.代理模式.万能代理类;

import 设计模式.代理模式.万能代理类.Loador;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/3116:55
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
        //设置代理对象
        invocationHandlertest.setAction(loador);
        //生成代理对象
        Action proxy = (Action)invocationHandlertest.getinstance();
        proxy.info();

    }
}
