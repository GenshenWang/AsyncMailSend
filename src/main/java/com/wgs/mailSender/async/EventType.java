package com.wgs.mailSender.async;

/**
 * Created by wanggenshen_sx on 2017/5/9.
 */
public enum EventType {

	CAlCULATE(0),
	COPYFILE(1),
	MAIL(2);

	private int value;
	public int getValue(){
		return value;
	}

	EventType(int value){
		this.value = value;
	}
}
