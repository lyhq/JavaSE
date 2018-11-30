package shk.lyhq.design.patterns.Prototype;

/**
 * 原型模式 （浅复制）
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 
 * 参与的对象
 * 1. Prototype 声明一个克隆自身的接口。
 * 2. ConcretePrototype 实现一个克隆自身的操作。
 * 3. Client（PrototypeTest） 让一个原型克隆自身从而创建一个新的对象。
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype prototype = new ConcretePrototype("原型模式");
		Prototype clone = (Prototype) prototype.clone();
		System.out.println(prototype.getName());
		System.out.println(clone.getName());
	}
}
