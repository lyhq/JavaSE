package shk.lyhq.design.patterns.State.Scene;

/**
 * 状态切换类
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public class Context {

	private Weather weather;

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public Weather getWeather() {
		return this.weather;
	}

	public String weatherMessage() {
		return weather.getWeather();
	}
}
