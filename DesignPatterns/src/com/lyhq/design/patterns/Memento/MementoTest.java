package com.lyhq.design.patterns.Memento;

/**
 * 备忘录模式
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 * 
 * 适用性
 * 1.必须保存一个对象在某一个时刻的(部分)状态,这样以后需要时它才能恢复到先前的状态。
 * 2.如果一个用接口来让其它对象直接得到这些状态，将会暴露对象的实现细节并破坏对象的封装性。
 * 
 * 参与者
 * 1.Memento 备忘录存储原发器对象的内部状态。
 * 2.Original 原发器创建一个备忘录,用以记录当前时刻它的内部状态。使用备忘录恢复内部状态.
 * 3.Storage 负责保存好备忘录。不能对备忘录的内容进行操作或检查。
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class MementoTest {

	public static void main(String[] args) {
		Original original = new Original("工作中...");
		
		//创建备份并保存
		Memento memento = original.createMemento();
		Storage storage = new Storage(memento);
		
		original.showState();
		original.setState("学习中...");
		original.showState();
		
		System.out.println("恢复备份...");
		original.restoreMemento(storage.getMemento());
		original.showState();
	}
}
