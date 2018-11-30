package shk.lyhq.design.patterns.Builder;

/**
 * 建造者模式
 * 
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 
 * 参与者
 * 1.Builder（ICarBuilder） 为创建一个Product对象的各个部件指定抽象接口。
 * 2.ConcreteBuilder（SedanCarBuilder） 实现Builder的接口以构造和装配该产品的各个部件。
 * 	   定义并明确它所创建的表示。提供一个检索产品的接口。
 * 3.Director 构造一个使用Builder接口的对象。
 * 4.Product（Car） 表示被构造的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配过程。
 *   包含定义组成部件的类，包括将这些部件装配成最终产品的接口。
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class BuilderTest {
	public static void main(String[] args) {
		//1、请一个设计者
		Director director = new Director();
		
		//2、请来一个建造者（工人）来建造
		ICarBuilder builder = new SedanCarBuilder();
		
		//3、设计者命令建造者开始建造工作,完成建造任务后交货
		Car car = director.construct(builder);
		
		System.out.println(car);
		
		System.out.println("==============================");
		
		//4、再请一个建造者来建造,完成建造任务后交货
		Car car2 = director.construct(new TruckCarBuilder());
		System.out.println(car2);
	}
}
