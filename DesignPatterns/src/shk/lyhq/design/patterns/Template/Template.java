package shk.lyhq.design.patterns.Template;

/**
 * 模板抽象类
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public abstract class Template {

	//留给子类重写逻辑
	abstract void print();
	
	//主方法
	public void update() {
		for (int i = 0; i < 5; i++) {
			print();
		}
	}
}
