package shk.lyhq.design.patterns.Visitor;

/**
 * 访问者接口，存放要访问的对象，
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public interface Visitor {

	// 访问消费账单
	void visit(ConsumeBill consumeBill);

	// 访问收入账单
	void visit(IncomeBill incomeBill);
}
