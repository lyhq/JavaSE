package shk.lyhq.design.patterns.COR.Scene.Single;

/**
 * 请求实体类
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class LeaveRequest {

	private String empName;
	private Integer leaveDay;
	private String reason;

	public LeaveRequest(String empName, Integer leaveDay, String reason) {
		super();
		this.empName = empName;
		this.leaveDay = leaveDay;
		this.reason = reason;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getLeaveDay() {
		return leaveDay;
	}

	public void setLeaveDay(Integer leaveDay) {
		this.leaveDay = leaveDay;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
