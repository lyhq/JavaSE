package shk.lyhq.design.patterns.Flyweight;

/**
 * 实现Flyweight接口，并为内部状态（如果有的话）增加存储空间。
 * ConcreteFlyweight对象必须是可共享的。它所存储的状态必须是内部的；
 * 即，它必须独立于ConcreteFlyweight对象的场景。
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class ConcreteFlyweight implements Flyweight {

	public void action(int arg) {
		// TODO Auto-generated method stub
		System.out.println("参数值: " + arg);
	}
}