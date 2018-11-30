package shk.lyhq.design.patterns.COR.Scene.Single;

/**
 * 请求处理者抽象基类
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public abstract class Leader {

	protected String name;// 领导名字

	protected Leader nextLeader;// 下一个处理者（上级领导）

	public Leader(String name) {
		super();
		this.name = name;
	}

	//设置下一个处理者，将产生指向下一个处理者的引用
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	//抽象处理请求的方法
	public abstract void handleRequest(LeaveRequest request);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
