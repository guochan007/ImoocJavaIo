package com.imooc.io;

public class EncodeDemo {

	/**
	 * 编码示例
	 * 
	 */
	public static void main(String[] args)throws Exception {

		String s="慕课ABC";
		byte[] bytes1=s.getBytes();//转行成字节序列用的是项目默认的编码gbk
		for(byte b:bytes1){
//			把字节转换成int以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			c4 bd bf ce 41 42 43 
		}
		System.out.println();
		
		
		byte[] bytes2=s.getBytes("gbk");
		for(byte b:bytes2){
//			把字节转换成int以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			c4 bd bf ce 41 42 43 
//			gbk编码中文占用2个字节，英文占用1个字节
		}
		System.out.println();
		
		
		byte[] bytes3=s.getBytes("utf-8");
		for(byte b:bytes3){
//			把字节转换成int以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			e6 85 95 e8 af be 41 42 43  
//			utf-8编码中文占用3个字节，英文占用1个字节
		}
		System.out.println();
		
		
		byte[] bytes4=s.getBytes("utf-16be");
		for(byte b:bytes4){
//			把字节转换成int以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			61 55 8b fe 0 41 0 42 0 43   
//			utf-16be编码 （java是双字节编码）中文占用2个字节，英文占用2个字节
		}
		System.out.println();
		
		
//		当你的字节序列是某种编码时，这个时候想把字节序列变成字符串，也需要用这种编码方式，否则乱码
		String str1=new String(bytes4);//用项目默认的gbk
		System.out.println(str1);
		String str2=new String(bytes4,"utf-16be");
		System.out.println(str2);
		
		
//		其实文本文件就是字节序列，可以是任意编码的字节序列
//		如果在中文机器上直接新建文本文件txt，那么该文本文件默认以ansi编码来保存文字信息（gbk）
		
	}

}
