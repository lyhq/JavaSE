package shk.lyhq.design.patterns.AbstractFactory;

/**
 * 具体的对象3,实现接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class BlackCat implements ICat {

	@Override
	public void eat() {
		System.out.println("BlackCat...eat...");
	}

}
