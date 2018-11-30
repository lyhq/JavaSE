package shk.lyhq.design.patterns.AbstractFactory;

/**
 * 抽象工厂接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public interface IAnimalFactory {

	//生产对象
	ICat createCat();
	
	//生产对象
	IDog createDog();
}
