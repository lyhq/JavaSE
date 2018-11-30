package shk.lyhq.design.patterns.Builder;

/**
 * 导演类，设计者
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class Director {

	// 命令建造者开始建造工作,完成建造工作后交货
	public Car construct(ICarBuilder builder) {
		builder.buildWheel();
		builder.buildTyre();
		builder.buildEngine();
		return builder.getCar();
	}

}
