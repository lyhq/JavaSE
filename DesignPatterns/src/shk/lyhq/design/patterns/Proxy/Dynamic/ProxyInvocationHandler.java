package shk.lyhq.design.patterns.Proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 实现了InvocationHandler接口的类
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class ProxyInvocationHandler implements InvocationHandler {

	private Object obj;// 被代理类的对象

	// 1、绑定被代理类的对象, 给它实例化
	// 2、返回一个代理类的对象
	public Object bind(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

	//代理类对象调用目标方法，都会转化为调用该invoke方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ProxyInvocationHandler...invoke...");
		//真正执行操作的是被代理类的目标方法，返回值是result
		Object result = method.invoke(obj, args);//调用被代理类的目标方法
		return result;
	}

}
