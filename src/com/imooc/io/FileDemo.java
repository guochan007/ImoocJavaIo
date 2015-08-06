package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	/**
	 * 创建目录 文件 
	 * 获得目录文件 路径 名字
	 */
	public static void main(String[] args) {
		// 了解构造函数的情况  查帮助 new File()有几种参数
		File file = new File("E:\\javaio\\imooc");//用双斜杠是转义字符
//		判断文件是否存在
		//System.out.println(file.exists());
		if(!file.exists())
			file.mkdir(); //涉及到多级目录的时候用 file.mkdirs()
		else
			file.delete();
		//是否是一个目录  如果是目录返回true,如果不是目录or目录不存在返回的是false
		System.out.println(file.isDirectory());
		//是否是一个文件
		System.out.println(file.isFile());
		
		//File file2 = new File("e:\\javaio\\日记1.txt");
		File file2 = new File("e:\\javaio","日记1.txt");
		if(!file2.exists())
			try {
//				创建该文件
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else 
			file2.delete();
         //常用的File对象的API
		System.out.println(file);//file.toString()的内容  打出的是路径
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println(file.getParent());
		System.out.println(file2.getParent());
		System.out.println(file.getParentFile().getAbsolutePath());
	}

}
