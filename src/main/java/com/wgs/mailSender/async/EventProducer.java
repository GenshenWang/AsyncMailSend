package com.wgs.mailSender.async;


import com.alibaba.fastjson.JSONObject;
import com.wgs.mailSender.util.JedisAdapter;
import com.wgs.mailSender.util.RedisKeyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanggenshen_sx on 2017/5/9.
 */
@Service
public class EventProducer {
	private static final Logger logger = LoggerFactory.getLogger(EventProducer.class);

	@Autowired
	JedisAdapter jedisAdapter;

	public boolean fireEvent(EventModel eventModel){
		try {
			//序列化
			String json = JSONObject.toJSONString(eventModel);
			//产生key
			String key = RedisKeyUtil.getEventQueueKey();
			//放入工作队列中
			jedisAdapter.lpush(key, json);
			return true;
		}catch (Exception e){
			logger.error("EventProducer fireEvent 异常 ：" + e.getMessage());
			return false;
		}

	}
}
