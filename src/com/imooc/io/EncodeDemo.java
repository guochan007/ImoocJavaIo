package com.imooc.io;

public class EncodeDemo {

	/**
	 * ����ʾ��
	 * 
	 */
	public static void main(String[] args)throws Exception {

		String s="Ľ��ABC";
		byte[] bytes1=s.getBytes();//ת�г��ֽ������õ�����ĿĬ�ϵı���gbk
		for(byte b:bytes1){
//			���ֽ�ת����int��16���Ƶķ�ʽ��ʾ
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			c4 bd bf ce 41 42 43 
		}
		System.out.println();
		
		
		byte[] bytes2=s.getBytes("gbk");
		for(byte b:bytes2){
//			���ֽ�ת����int��16���Ƶķ�ʽ��ʾ
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			c4 bd bf ce 41 42 43 
//			gbk��������ռ��2���ֽڣ�Ӣ��ռ��1���ֽ�
		}
		System.out.println();
		
		
		byte[] bytes3=s.getBytes("utf-8");
		for(byte b:bytes3){
//			���ֽ�ת����int��16���Ƶķ�ʽ��ʾ
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			e6 85 95 e8 af be 41 42 43  
//			utf-8��������ռ��3���ֽڣ�Ӣ��ռ��1���ֽ�
		}
		System.out.println();
		
		
		byte[] bytes4=s.getBytes("utf-16be");
		for(byte b:bytes4){
//			���ֽ�ת����int��16���Ƶķ�ʽ��ʾ
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			61 55 8b fe 0 41 0 42 0 43   
//			utf-16be���� ��java��˫�ֽڱ��룩����ռ��2���ֽڣ�Ӣ��ռ��2���ֽ�
		}
		System.out.println();
		
		
//		������ֽ�������ĳ�ֱ���ʱ�����ʱ������ֽ����б���ַ�����Ҳ��Ҫ�����ֱ��뷽ʽ����������
		String str1=new String(bytes4);//����ĿĬ�ϵ�gbk
		System.out.println(str1);
		String str2=new String(bytes4,"utf-16be");
		System.out.println(str2);
		
		
//		��ʵ�ı��ļ������ֽ����У����������������ֽ�����
//		��������Ļ�����ֱ���½��ı��ļ�txt����ô���ı��ļ�Ĭ����ansi����������������Ϣ��gbk��
		
	}

}
