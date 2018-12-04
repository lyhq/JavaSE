package shk.lyhq.design.patterns.Mediator;

/**
 * 抽象中介类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public abstract class Mediator {

	//目标方法
	abstract void notice(Colleague colleague);
}
