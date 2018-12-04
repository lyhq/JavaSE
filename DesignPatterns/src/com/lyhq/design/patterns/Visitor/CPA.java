package com.lyhq.design.patterns.Visitor;

/**
 * 具体的访问者，会计类
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public class CPA implements Visitor {

	private int count;
	
	@Override
	public void visit(ConsumeBill consumeBill) {
		count++;
		if (consumeBill.getItem().equals("消费")) {
            System.out.println("第" + count + "个单子消费了：" + consumeBill.getAmount());
        }
	}

	@Override
	public void visit(IncomeBill incomeBill) {
		count++;
		if (incomeBill.getItem().equals("收入")) {
            System.out.println("第" + count + "个单子收入了：" + incomeBill.getAmount());
        }
	}

}
