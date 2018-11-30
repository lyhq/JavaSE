package shk.lyhq.design.patterns.Composite.Scene.Interface;

/**
 * 实际的树叶节点
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Leaf implements ILeaf {

	private String name;

	public Leaf(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getInfo() {
		return "树叶->" + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
