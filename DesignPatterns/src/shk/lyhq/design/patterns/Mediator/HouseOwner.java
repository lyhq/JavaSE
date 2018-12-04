package shk.lyhq.design.patterns.Mediator;

/**
 * 具体的同事类，房东
 * @author yangrun
 * @date 2018年12月3日
 */
public class HouseOwner extends Colleague {

	@Override
	void action() {
		System.out.println("我是房东，有房出租，租户可以来租了...");
	}

}
