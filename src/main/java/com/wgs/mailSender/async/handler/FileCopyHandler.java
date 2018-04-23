package com.wgs.mailSender.async.handler;

import com.wgs.mailSender.async.EventHandler;
import com.wgs.mailSender.async.EventModel;
import com.wgs.mailSender.async.EventType;
import com.wgs.mailSender.util.FileCopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wanggenshen_sx on 2017/5/10.
 */
@Component
public class FileCopyHandler implements EventHandler {
	private static final Logger logger = LoggerFactory.getLogger(CalculateHandler.class);

	private static String source = "D:/SQL.zip";
	private static String target = "D:/copy/sql1.zip";

	@Override
	public void doHandler(EventModel eventModel) {

		long start1 = System.currentTimeMillis();
		//模拟从工作队列中取出的一个事件进行处理
		FileCopyUtil.copyFile(source, target);
		long end1 = System.currentTimeMillis();
		System.out.println("非业务运行完成，运行时间为**：" + (end1 - start1));
	}

	@Override
	public List<EventType> getSupportEventType() {
		return Arrays.asList(EventType.COPYFILE);
	}
}
