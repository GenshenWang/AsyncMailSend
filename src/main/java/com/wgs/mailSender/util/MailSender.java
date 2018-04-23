package com.wgs.mailSender.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;

/**
 * Created by wanggenshen_sx on 2017/5/8.
 */
@Service
public class MailSender implements InitializingBean {
	private static final Logger logger = LoggerFactory.getLogger(MailSender.class);
	private JavaMailSenderImpl mailSender;

	/**
	 * 发送邮件
	 * @param to
	 */
	public void sendMail(String to){
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("1032335358@qq.com");
		mailMessage.setTo(to);
		mailMessage.setSubject("Spring Mail Sender");
		mailMessage.setText("这是用Spring框架发送的邮件!");

		mailSender.send(mailMessage);
	}

	/**
	 * 配置邮件发送器
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		mailSender = new JavaMailSenderImpl();
		//用户名
		mailSender.setUsername("1032335358@qq.com");
		//SMTP客户端的授权码(每个人不一样，隐私)
		mailSender.setPassword("******");
		// 发件人邮箱的 SMTP 服务器地址
		mailSender.setHost("smtp.qq.com");
		//邮件服务器监听的端口
		mailSender.setPort(465);
		//协议SMTP+SSL
		mailSender.setProtocol("smtps");
		mailSender.setDefaultEncoding("utf8");
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.ssl.enable", true);
		mailSender.setJavaMailProperties(javaMailProperties);
	}
}
