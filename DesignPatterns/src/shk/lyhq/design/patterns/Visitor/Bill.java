package shk.lyhq.design.patterns.Visitor;

/**
 * 被访问者接口，accept方法，接受将要访问它的对象
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public interface Bill {

	void accept(Visitor visitor);
}
