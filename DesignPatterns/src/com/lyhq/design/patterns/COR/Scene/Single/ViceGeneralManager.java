package com.lyhq.design.patterns.COR.Scene.Single;

/**
 * 副总经理
 */
public class ViceGeneralManager extends Leader {
	public ViceGeneralManager(String name) {
		super(name);
	}

	/**
	 * 责任链上对象对请求的具体处理
	 */
	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDay() <= 20) {
			System.out.println(
					"请假人：" + request.getEmpName() + ",天数：" + request.getLeaveDay() + ",理由：" + request.getReason());
			System.out.println("审批人：" + this.name + " 副总经理，审批通过！");
		} else {
			if (this.nextLeader != null) {// 如果有下一个继承者
				// 让下一个继承者处理请求
				this.nextLeader.handleRequest(request);
			}
		}
	}
}