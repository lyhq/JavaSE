package com.lyhq.design.patterns.Visitor;

/**
 * 具体的访问者，老板
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public class Boss implements Visitor {
	
	private double totalConsume;
	private double totalIncome;

	@Override
	public void visit(ConsumeBill consumeBill) {
		totalConsume += consumeBill.getAmount();
	}

	@Override
	public void visit(IncomeBill incomeBill) {
		totalIncome += incomeBill.getAmount();
	}

	public void getTotalConsume() {
		System.out.println("老板消费了" + totalConsume + "元");
	}

	public void getTotalIncome() {
		System.out.println("老板收入了" + totalIncome + "元");
	}

	
}
