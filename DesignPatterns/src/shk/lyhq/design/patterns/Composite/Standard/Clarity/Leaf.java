package shk.lyhq.design.patterns.Composite.Standard.Clarity;

import java.util.List;

/**
 * Leaf叶子构件：叶子对象，其下再也没有其它分支，也就是遍历的最小单位。
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Leaf extends Component {
	/*
	 * 可以覆写父类方法 
	 * public void doSomething(){
	 * 
	 * }
	 */
	
	public void add(Component component) {
		// 空实现，直接抛一个“不支持请求”异常
		throw new UnsupportedOperationException();
	}

	public void remove(Component component) {
		// 空实现，直接抛一个“不支持请求”异常
		throw new UnsupportedOperationException();
	}

	public List<Component> getChildren() {
		// 空实现，直接抛一个“不支持请求”异常
		throw new UnsupportedOperationException();
	}
}
