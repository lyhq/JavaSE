package shk.lyhq.design.patterns.Memento;

/**
 * 备忘录类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class Memento {

	// 状态
	private String state;

	public Memento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
