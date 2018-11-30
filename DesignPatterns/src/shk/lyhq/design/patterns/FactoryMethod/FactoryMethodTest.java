package shk.lyhq.design.patterns.FactoryMethod;

/**
 * 工厂方法模式
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类。
 * 
 * 参与者
 * 1.Sender 定义工厂方法所创建的对象需要实现的接口。
 * 2.ConcreteSender 实现Sender接口，重写具体的动作方法。
 * 3.Provider 定义工厂类需要实现的接口，声明工厂方法，该方法返回一个Sender类型的对象。
 * 	Provider也可以定义一个工厂方法的缺省实现，它返回一个缺省的ConcreteSender对象。
 *  可以调用工厂方法以创建一个Sender对象。
 * 4.ConcreteSenderFactory 重定义工厂方法以返回一个ConcreteSender实例。
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		Provider provider = new SmsSenderFactory();
		Sender sender = provider.produce();
		sender.sendMessage();
	}
}
