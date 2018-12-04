package shk.lyhq.design.patterns.State.Scene;

/**
 * 状态模式
 * 随着状态的改变，行为也将改变
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public class Test {

	public static void main(String[] args) {
		Context ctx1 = new Context();
		ctx1.setWeather(new Sunshine());
		System.out.println(ctx1.weatherMessage());

		System.out.println("===============");

		Context ctx2 = new Context();
		ctx2.setWeather(new Rain());
		System.out.println(ctx2.weatherMessage());
	}
}
