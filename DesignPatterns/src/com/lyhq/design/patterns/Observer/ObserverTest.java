package com.lyhq.design.patterns.Observer;

/**
 * 观察者模式（Observer）
 * 
 * 观察者模式很好理解，类似于邮件订阅和 RSS 订阅，当我们浏览一些博客或 wiki 时，
 * 经常会看到RSS图标，就这的意思是，当你订阅了该文章，如果后续有更新，会及时通知你。
 * 其实，简单来讲就一句话：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！
 * 对象之间是一种一对多的关系。先来看看关系图：Observer.png
 * 
 * 类的作用: 
 * 		MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，
 * 		当MySubject变化时，Observer1和Observer2必然变化。
 * 		AbstractSubject类中定义着需要监控的对象列表，
 * 		可以对其进行修改：增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象。
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new MySubject();
		
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		subject.add(observer1);
		subject.add(observer2);
		
		subject.operation();
		
		subject.delete(observer1);
		
		subject.operation();
		
	}
}
