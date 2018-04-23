package com.wgs.mailSender.async.handler;

import com.wgs.mailSender.async.EventHandler;
import com.wgs.mailSender.async.EventModel;
import com.wgs.mailSender.async.EventType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wanggenshen_sx on 2017/5/9.
 */
@Component
public class CalculateHandler implements EventHandler {
	private static final Logger logger = LoggerFactory.getLogger(CalculateHandler.class);

	@Override
	public void doHandler(EventModel eventModel) {
		//task3 : 模拟非主业务
		//TaskUtil.runTask3();
	}

	@Override
	public List<EventType> getSupportEventType() {
		return Arrays.asList(EventType.CAlCULATE);
	}
}
