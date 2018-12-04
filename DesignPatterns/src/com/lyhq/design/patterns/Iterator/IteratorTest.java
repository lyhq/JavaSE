package com.lyhq.design.patterns.Iterator;

/**
 * 迭代器模式
 * 
 * 迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。
 * 这句话包含两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
 * 
 * 参与者
 * 1.Iterator 迭代器定义访问和遍历元素的接口。
 * 2.ConcreteIterator 具体迭代器实现迭代器接口。 对该聚合遍历时跟踪当前位置。
 * 3.Collection 聚合定义创建相应迭代器对象的接口。
 * 4.ConcreteCollection 具体聚合实现创建相应迭代器的接口，该操作返回ConcreteIterator的一个适当的实例.
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class IteratorTest {

	public static void main(String[] args) {
		Collection collection = new ConcreteCollection();
		collection.add(0);
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);
		collection.add(5);
		System.out.println("collection...size... = " + collection.size());
		
		System.out.println("==================================================");
		
		Iterator iterator = collection.iterator();
		System.out.println("iterator...first = " + iterator.first().toString());
		System.out.println("iterator...hasPrev..." + iterator.hasPrev());
		System.out.println("iterator...hasNext..." + iterator.hasNext());
		
		System.out.println("=================================================");
		
		System.out.println("iterator...last = " + iterator.last().toString());
		System.out.println("iterator...hasPrev..." + iterator.hasPrev());
		System.out.println("iterator...hasNext..." + iterator.hasNext());
		
		System.out.println("=================================================");
		
//		System.out.println("iterator...prev = " + iterator.prev());
		System.out.println("iterator...next = " + iterator.next());
		
		System.out.println("=================================================");
		
		System.out.println("iterator...first = " + iterator.first().toString());
		System.out.println("iterator...prev = " + iterator.prev());
//		System.out.println("iterator...next = " + iterator.next());
		
		System.out.println("元素迭代循环输出...");
		//第一种迭代方式
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("=================================================");
        //第二种迭代方式
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }

	}
}
