package shk.lyhq.design.patterns.FactoryMethod;

/**
 * 消息发送接口的实现类
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public class MailSender implements Sender {

	@Override
	public void sendMessage() {
		System.out.println("邮件发送...");
	}

}
