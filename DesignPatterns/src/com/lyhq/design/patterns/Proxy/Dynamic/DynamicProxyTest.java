package com.lyhq.design.patterns.Proxy.Dynamic;

/**
 * 动态代理
 * 
 * 代理类在程序运行时被创建的代理方式被成为动态代理。
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class DynamicProxyTest {

	public static void main(String[] args) {
		//1、创建一个被代理类的对象
		Source source = new Source();
		
		//2、创建一个实现了InvocationHandler接口的实现类的对象
		ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
		
		//3、对source实例化，并返回一个同样 实现了被代理类所实现的接口 的代理类对象
		Object obj = invocationHandler.bind(source);
		Sourceable proxy = (Sourceable) obj;//这个就是代理类对象
		
		//4、执行目标方法，会自动转到对InvacationHandler接口的实现类的invoke()方法的调用
		proxy.action();
		
		System.out.println("=============================================");
		
		//5、把静态代理的被代理类也拿过来实现下
		//1)创建一个被代理类的对象
		com.lyhq.design.patterns.Proxy.Static.Source subject 
				= new com.lyhq.design.patterns.Proxy.Static.Source();
		//2)对subject实例化，并返回一个同样 实现了被代理类所实现的接口 的代理类对象
		Object object = invocationHandler.bind(subject);
		com.lyhq.design.patterns.Proxy.Static.Sourceable proxySource 
				= (com.lyhq.design.patterns.Proxy.Static.Sourceable) object;//这个就是代理类对象
		//3）、执行目标方法，会自动转到对InvacationHandler接口的实现类的invoke()方法的调用
		proxySource.method();
		
	}
}
