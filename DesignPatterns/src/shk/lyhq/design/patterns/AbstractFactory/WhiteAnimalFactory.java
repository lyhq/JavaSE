package shk.lyhq.design.patterns.AbstractFactory;

/**
 * 具体的工厂类，实现工厂接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class WhiteAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		// 生产白猫一只
		return new WhiteCat();
	}

	@Override
	public IDog createDog() {
		// 生产白狗一只
		return new WhiteDog();
	}

}
