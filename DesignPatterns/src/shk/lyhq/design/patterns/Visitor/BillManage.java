package shk.lyhq.design.patterns.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 辅助类，账单管理类
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public class BillManage {

	private List<Bill> billList = new ArrayList<Bill>();

	// 添加账单
	public void addBill(Bill bill) {
		billList.add(bill);
	}

	// 给账单分配访问者
	public void distributeVisitor(Visitor visitor) {
		for (Bill bill : billList) {
			bill.accept(visitor);
		}
	}
}
