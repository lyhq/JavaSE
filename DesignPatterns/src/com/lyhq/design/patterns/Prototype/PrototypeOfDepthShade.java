package com.lyhq.design.patterns.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 实现深浅复制的例子
 * 
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。 
 * 简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public class PrototypeOfDepthShade implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	private int i;
	private SerializableObject obj = new SerializableObject();

	// 浅复制
	public Object shadeClone() throws CloneNotSupportedException {
		PrototypeOfDepthShade prototype = (PrototypeOfDepthShade) super.clone();
		return prototype;
	}

	// 深复制，利用二进制流进行写出再读入操作
	public Object deepClone() throws IOException, ClassNotFoundException {

		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		// 浅复制
		PrototypeOfDepthShade pds = new PrototypeOfDepthShade();
		PrototypeOfDepthShade shadeClone = (PrototypeOfDepthShade) pds.shadeClone();
		System.out.println(pds.getObj().toString());
		System.out.println(shadeClone.getObj().toString());

		// 深复制
		PrototypeOfDepthShade pds1 = new PrototypeOfDepthShade();
		PrototypeOfDepthShade deepClone = (PrototypeOfDepthShade) pds.deepClone();
		System.out.println(pds1.getObj().toString());
		System.out.println(deepClone.getObj().toString());
	}
}

class SerializableObject implements Serializable {
	private static final long serialVersionUID = 1L;
}
