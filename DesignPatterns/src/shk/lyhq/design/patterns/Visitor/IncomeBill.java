package shk.lyhq.design.patterns.Visitor;

/**
 * 具体的账单，收入账单
 * @author yangrun
 * @date 2018年12月4日
 */
public class IncomeBill implements Bill {

	private String item;
	private double amount;

	public IncomeBill(String item, double amount) {
		super();
		this.item = item;
		this.amount = amount;
	}

	public String getItem() {
		return item;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public void accept(Visitor visitor) {
		// 访问者访问收入账单
		visitor.visit(this);
	}

}
