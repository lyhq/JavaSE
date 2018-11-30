package shk.lyhq.design.patterns.COR.Scene.Complex;

/**
 * 请求处理器的抽象类
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public abstract class AbstractHandler {

	// 责任链中的下一个元素
	protected AbstractHandler nextHandler;

	// 共有方法，设置下一个处理者, 拥有对下一个处理者的指向
	public void setNextHandler(AbstractHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	// 处理请求
	public abstract void handleRequest(AbstractRequest request);
}
