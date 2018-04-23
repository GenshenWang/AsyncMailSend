package com.wgs.mailSender.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Created by wanggenshen_sx on 2017/5/10.
 */
public class FileCopyUtil {
	private static final Logger logger = LoggerFactory.getLogger(FileCopyUtil.class);

	private static String source = "D:/HEXO.zip";
	private static String target = "D:/copy/1.zip";

	public static long copyFile(String source, String target){

		long startTime = System.currentTimeMillis();
		File srcFile = new File(source);
		File destFile = new File(target);

		InputStream in = null;
		OutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(source));
			out = new BufferedOutputStream(new FileOutputStream(target));

			byte[]  bytes = new byte[4096];
			int len = 0;
			while ((len = in.read(bytes)) != -1){
				out.write(bytes, 0, len);
			}
			out.flush();

			long endTime = System.currentTimeMillis();
			return (endTime - startTime);
		}catch (Exception e){
			e.printStackTrace();
			logger.error("文件复制异常：" + e.getMessage());
			return -1;
		}finally {
			if (out != null){
				try {
					out.close();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
			if (in != null){
				try {
					in.close();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}



	}


	public static void main(String[] args){
		System.out.print(copyFile(source, target));
	}








}
