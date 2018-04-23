package com.wgs.mailSender.async.handler;

import com.wgs.mailSender.async.EventHandler;
import com.wgs.mailSender.async.EventModel;
import com.wgs.mailSender.async.EventType;
import com.wgs.mailSender.util.MailSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wanggenshen_sx on 2017/5/10.
 */
@Component
public class MailHandler implements EventHandler{
	private static final Logger logger = LoggerFactory.getLogger(MailHandler.class);

	@Autowired
	MailSender mailSender;

	@Override
	public void doHandler(EventModel eventModel) {
		try {
			mailSender.sendMail(eventModel.getExt("email"));
		}catch (Exception e){
			logger.error("邮件发送异常：" + e.getMessage());
		}
	}

	@Override
	public List<EventType> getSupportEventType() {
		return Arrays.asList(EventType.MAIL);
	}
}
