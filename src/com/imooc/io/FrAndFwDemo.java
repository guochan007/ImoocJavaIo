package com.imooc.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FrAndFwDemo {
	public static void main(String[] args) throws IOException{
//		构造比InputStreamReader和OutputStreamReader简单，注意没有指定编码格式，出现乱码没法解决
		FileReader fr = new FileReader("e:\\javaio\\imooc.txt");
		FileWriter fw = new FileWriter("e:\\javaio\\imooc2.txt");
		//FileWriter fw = new FileWriter("e:\\javaio\\imooc2.txt",true);//追加
		char[] buffer = new char[2056];//字符数组
		int c ;
		while((c = fr.read(buffer,0,buffer.length))!=-1){
			fw.write(buffer,0,c);
			fw.flush();
		}
		fr.close();
		fw.close();
	}

}
