package shk.lyhq.design.patterns.FactoryMethod;

/**
 * 生产消息发送者工厂接口的实现类
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public class SmsSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
