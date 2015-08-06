package com.imooc.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DisDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "demo/dos.dat";
		IOUtil.printHex(file);
		System.out.println();
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		int i = dis.readInt();
		System.out.println(i);
		i = dis.readInt();
		System.out.println(i);
		long l = dis.readLong();
		System.out.println(l);
		double d = dis.readDouble();
		System.out.println(d);
		String s = dis.readUTF();
		System.out.println(s);
		char s1 = dis.readChar();
		char s2 = dis.readChar();
		System.out.print(s1);
		System.out.print(s2);

		dis.close();
	}

}
