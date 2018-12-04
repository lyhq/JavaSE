package shk.lyhq.design.patterns.Mediator;

/**
 * 具体的同事类，租户
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class Tenant extends Colleague {

	@Override
	void action() {
		System.out.println("我是租户，要租房，房东请拿房来租...");
	}

}
