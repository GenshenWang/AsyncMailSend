package com.wgs.mailSender.async;

import java.util.List;

/**
 * Created by wanggenshen_sx on 2017/5/9.
 */
public interface EventHandler {
	//处理事件
	void doHandler(EventModel eventModel);
	//获取关注事件的类型
	List<EventType> getSupportEventType();

}
