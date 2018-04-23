package com.wgs.mailSender.util;

/**
 * Created by wanggenshen_sx on 2017/5/9.
 */
public class RedisKeyUtil {

	private static String EVENT_KEY = "ASYNC_EVENT_KEY";

	public static String getEventQueueKey(){
		return EVENT_KEY;
	}
}
