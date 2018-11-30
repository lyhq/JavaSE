package shk.lyhq.design.patterns.COR.Scene.Single;

/**
 * 责任链模式总结
 * 实现方式：
 * 1、链表方式：比如刚才的请假审批
 * 2、非链表方式：通过集合，数组生成责任链更加实用，将链表上的各个对象都添加到集合中，然后通过反射给构建出来。
 * 	然后在容器里一个个的处理。（也就是说把测试代码中除了请假的其他代码都给用一个类来处理）
 * 
 * 开发中常见场景：
 * 1、Java的异常机制就是一个责任链模式，一个try可以对应多个cathc。如果某一个catch不匹配，则跳到下一个catch中
 * 2、JavaScript语言中的事件的冒泡和捕获机制
 * 3、Servlet开发中，过滤器的链式处理
 * 4、Struts2中，拦截器的调用也是典型的责任链模式
 * 
 * 责任链的好处：
 * 1、接受者和发送者都没有对方的明确信息，且链中的对象也并不知道链的结构，结果是责任链可简化对象的相互连接，
 * 	它们仅需保持一个指向其后继者的引用，而不需要保持它所有的候选继承者，大大的降低了耦合度。
 * 	请求者不用管具体哪个对象会处理，反正该请求肯定会被处理就行了
 * 2、可以随时增加或者修改处理一个请求的结构，增加了给对象指派职责的灵活性
 * 
 * 测试
 * 
 * 临时增加副总经理角色：ViceGeneralManager, 构造副总经理对象。然后再设置继承者的关系.
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class Client {

	public static void main(String[] args) {
		// 构建各个领导人
		Leader a = new Director("张组长");// 组长
		Leader b = new Manager("李经理");// 经理
		
		//临时增加副总经理
	    //Leader b2 = new ViceGeneralManager("赵四");//副总经理
		
		Leader c = new GeneralManager("王总经理");// 总经理
		// 设置各个责任链上的关系
		a.setNextLeader(b);// 组长的下一个审批人为经理
		
		//b.setNextLeader(b2);//临时设置经理的下一个审批人为副总经理
		//b2.setNextLeader(c);// 副总经理的下一个审批人为总经理
		
		b.setNextLeader(c);// 经理的下一个审批人为总经理

		// 开始请假
		LeaveRequest request = new LeaveRequest("小明", 3, "旅游");
		a.handleRequest(request);// 小明提交了请假申请给组长
		
		System.out.println("======================================");
		request = new LeaveRequest("小李", 6, "旅游");
		a.handleRequest(request);// 小李提交了请假申请给组长
		
		System.out.println("======================================");
		request = new LeaveRequest("小红", 13, "旅游");
		a.handleRequest(request);// 小红提交了请假申请给组长
		
		System.out.println("======================================");
		request = new LeaveRequest("小张", 33, "旅游");
		a.handleRequest(request);// 小张提交了请假申请给组长
	}
}
