package com.imooc.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//������ļ������ڣ���ֱ�Ӵ�����������ڣ�ɾ���󴴽�
		FileOutputStream out = new FileOutputStream("demo/out.dat");
		//������ļ������ڣ���ֱ�Ӵ�����������ڣ����ļ�����׷������
//		FileOutputStream out = new FileOutputStream("demo/out.dat",true);
		out.write('A');//дһ���ֽ�  д����'A'�ĵͰ�λ
		out.write('B');//д����'B'�ĵͰ�λ
		int a = 10;//writeֻ��д��λ,��ôдһ��int��Ҫд4��  int����32λ ÿ��8λ
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		byte[] gbk = "�й�".getBytes("gbk");
		out.write(gbk);
		out.close();
		
		IOUtil.printHex("demo/out.dat");
		

	}

}
