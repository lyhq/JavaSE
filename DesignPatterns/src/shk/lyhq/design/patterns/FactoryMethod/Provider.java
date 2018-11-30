package shk.lyhq.design.patterns.FactoryMethod;

/**
 * 生产消息发送者工厂的接口
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public interface Provider {
	
	//生产消息发送工厂并返回
	Sender produce();
}
