package shk.lyhq.design.patterns.Mediator;

/**
 * 具体的中介类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class ConcreteMediator extends Mediator {

	@Override
	void notice(Colleague colleague) {
		if (colleague instanceof HouseOwner) {
			HouseOwner houseOwner = (HouseOwner) colleague;
			houseOwner.action();
		} else if (colleague instanceof Tenant) {
			Tenant tenant = (Tenant) colleague;
			tenant.action();
		}
	}

}
