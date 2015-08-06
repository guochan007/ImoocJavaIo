package com.imooc.io;

import java.io.File;
import java.io.IOException;
/**
 * �г�file�ĳ��ò���  ���� ���� 
 */
public class FileUtils {

/**
 * �г�ָ��Ŀ¼�£���������Ŀ¼���������ļ�
 * @param file
 * @throws IOException
 */
//	public static void listDirectory(File dir) throws IOException{
	public void listDirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("Ŀ¼��"+dir+"������");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"����Ŀ¼");
		}
		/*
		String [] fileNames=dir.list();//��������Ŀ¼
		for(String str:fileNames){
//			System.out.println(str);
			System.out.println(dir+"\\"+str);
		}
		
		System.out.println("******");
		File [] files=dir.listFiles();//��������Ŀ¼
		for(File file:files){
			System.out.println(file);
		}
		*/
		
		File [] files1=dir.listFiles();//������Ŀ¼
		if(files1!=null && files1.length>0){
			for(File file:files1){
				if(file.isDirectory()){
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
			
		}
	}

	public static void main(String[] args) throws IOException{
		FileUtils fileUtil=new FileUtils();
		fileUtil.listDirectory(new File("f:\\shouji"));
		
	}
}
