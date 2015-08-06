package com.imooc.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//如果该文件不存在，则直接创建，如果存在，删除后创建
		FileOutputStream out = new FileOutputStream("demo/out.dat");
		//如果该文件不存在，则直接创建，如果存在，在文件后面追加内容
//		FileOutputStream out = new FileOutputStream("demo/out.dat",true);
		out.write('A');//写一个字节  写入了'A'的低八位
		out.write('B');//写入了'B'的低八位
		int a = 10;//write只能写八位,那么写一个int需要写4次  int类型32位 每次8位
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		byte[] gbk = "中国".getBytes("gbk");
		out.write(gbk);
		out.close();
		
		IOUtil.printHex("demo/out.dat");
		

	}

}
