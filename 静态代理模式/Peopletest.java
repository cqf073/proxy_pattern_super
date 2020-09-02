package 设计模式.代理模式.静态代理模式;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/3115:03
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Peopletest {
    public static void main(String[] args) {
        Loador loador = new Loador();
        Agent agent = new Agent(loador);
        agent.Agentaction();

    }
}
