package shk.lyhq.design.patterns.COR;

/**
 * 责任链模式
 * 
 * 顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。
 * 这种类型的设计模式属于行为型模式。
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 * 
 * 应用实例： 
 * 	1、红楼梦中的"击鼓传花"。 
 * 	2、JS 中的事件冒泡。 
 * 	3、JAVA WEB 中 Apache Tomcat 对 Encoding 的处理，Struts2 的拦截器，jsp servlet 的 Filter。
 * 
 * 优点： 
 * 	1、降低耦合度。它将请求的发送者和接收者解耦。 
 * 	2、简化了对象。使得对象不需要知道链的结构。
 *  3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 
 *  4、增加新的请求处理类很方便。
 *  
 * 缺点： 
 *  1、不能保证请求一定被接收。 
 *  2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 
 *  3、可能不容易观察运行时的特征，有碍于除错。
 * 
 * 参与者
 * 1.Handler
 *  定义一个处理请求的接口。
 *  可选）实现后继链。
 * 2.ConcreteHandler
 * 	处理它所负责的请求。
 * 	可访问它的后继者。
 * 	如果可处理该请求，就处理之；否则将该请求转发给它的后继者。
 * 3.Client
 * 	向链上的具体处理者(ConcreteHandler)对象提交请求。
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class CORTest {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();

		handler1.setNextHandler(handler2);

		Request request = new Request("请求名字", "请求内容");

		handler1.handleRequest(request);
	}
}
