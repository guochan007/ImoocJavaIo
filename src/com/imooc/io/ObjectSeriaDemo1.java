package com.imooc.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
//�Ѷ������ֽڵ���ʽ���棬���߸ö�����Ҫ�������н��д��䣬���������л����ֽ�
public class ObjectSeriaDemo1 {
	public static void main(String[] args) throws Exception{
		String file = "demo/obj.dat";
//		��������л�
		/*ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file));
//		����student����
		Student stu = new Student("10001", "����", 20);
		oos.writeObject(stu);
		oos.flush();
		oos.close();*/
		
//		����ķ����л�
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file));
		Student stu = (Student)ois.readObject();
		System.out.println(stu);
		ois.close();
		
	}
	

}
