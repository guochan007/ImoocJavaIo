package com.imooc.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
//把对象以字节的形式保存，或者该对象需要在网络中进行传输，必须先序列化成字节
public class ObjectSeriaDemo1 {
	public static void main(String[] args) throws Exception{
		String file = "demo/obj.dat";
//		对象的序列化
		/*ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file));
//		创建student对象
		Student stu = new Student("10001", "张三", 20);
		oos.writeObject(stu);
		oos.flush();
		oos.close();*/
		
//		对象的反序列化
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file));
		Student stu = (Student)ois.readObject();
		System.out.println(stu);
		ois.close();
		
	}
	

}
