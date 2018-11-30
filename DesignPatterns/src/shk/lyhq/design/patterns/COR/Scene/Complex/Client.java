package shk.lyhq.design.patterns.COR.Scene.Complex;

/**
 * 职责链（责任链）模式
 * 
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * 这一模式的想法是，给多个对象处理一个请求的机会，从而解耦发送者和接受者.
 * 
 * 适用者
 * 1.有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
 * 2.你想在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 * 3.可处理一个请求的对象集合应被动态指定。
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
public class Client {

	public static void main(String[] args) {
		//创建出处理者
		AbstractHandler hrHandler = new HRHandler();
		AbstractHandler projectHandler = new ProjectManagerHandler();
		AbstractHandler teamLeaderHandler = new TeamLeaderHandler();
		
		//将处理者组成责任链
		teamLeaderHandler.setNextHandler(projectHandler);
		projectHandler.setNextHandler(hrHandler);
		
		//创建几个请求
		AbstractRequest leaveRequest = new LeaveRequest("请假", "请假一天");
		AbstractRequest addMoneyRequest = new AddMoneyRequest("加薪", "加薪2000");
		AbstractRequest dimissionRequest = new DimissionRequest("离职", "坚决离职");
		
		//处理者开始处理请求,将请求都试图交给teamLeaderHandler来处理
		teamLeaderHandler.handleRequest(leaveRequest);
		System.out.println("======================================");
		teamLeaderHandler.handleRequest(addMoneyRequest);
		System.out.println("======================================");
		teamLeaderHandler.handleRequest(dimissionRequest);
	}
}
