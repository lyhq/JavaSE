package com.lyhq.design.patterns.COR.Scene.Single;

/**
 * 组长
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	/**
	 * 责任链上对象对请求的具体处理
	 */
	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDay() <= 3) {
			System.out.println(
					"请假人：" + request.getEmpName() + ",天数：" + request.getLeaveDay() + ",理由：" + request.getReason());
			System.out.println("审批人：" + this.name + " 组长，审批通过！");
		} else {
			if (this.nextLeader != null) {// 如果有下一个处理者
				// 让下一个处理者处理请求
				this.nextLeader.handleRequest(request);
			}
		}
	}

}
