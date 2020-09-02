package 设计模式.代理模式.静态代理模式;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/3115:04
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Agent {
    private Loador loador;

    public Agent(Loador loador) {
        this.loador = loador;
    }

    public Agent() {
    }
    public void Agentaction(){
        loador.info();
        action();
    }
    public void action(){
        System.out.println("hand out tips");
    }
}
