package com.lyhq.design.patterns.COR.Scene.Complex;

/**
 * 请求的处理者（项目经理）
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class ProjectManagerHandler extends AbstractHandler {

	@Override
	public void handleRequest(AbstractRequest request) {
		if (request instanceof AddMoneyRequest) {//加薪请求
			System.out.println("项目经理处理请求，请求名字：" + request.getName() + ", 内容： "+ request.getMsg());
		} else {//处理不了，交给下一个处理者
			this.nextHandler.handleRequest(request);
		}
	}

}
