package shk.lyhq.design.patterns.Mediator;

/**
 * 抽象同事类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public abstract class Colleague {

	Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	// 目标行为
	abstract void action();
}
