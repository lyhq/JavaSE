package shk.lyhq.design.patterns.Prototype;

/**
 * 一个原型类，实现Cloneable接口
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public abstract class Prototype implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}

}
