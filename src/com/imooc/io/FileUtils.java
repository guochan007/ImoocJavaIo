package com.imooc.io;

import java.io.File;
import java.io.IOException;
/**
 * 列出file的常用操作  过滤 遍历 
 */
public class FileUtils {

/**
 * 列出指定目录下（包括其子目录）的所有文件
 * @param file
 * @throws IOException
 */
//	public static void listDirectory(File dir) throws IOException{
	public void listDirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录："+dir+"不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录");
		}
		/*
		String [] fileNames=dir.list();//不包含子目录
		for(String str:fileNames){
//			System.out.println(str);
			System.out.println(dir+"\\"+str);
		}
		
		System.out.println("******");
		File [] files=dir.listFiles();//不包含子目录
		for(File file:files){
			System.out.println(file);
		}
		*/
		
		File [] files1=dir.listFiles();//包含子目录
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
