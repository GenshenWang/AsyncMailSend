package com.wgs.mailSender.async;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanggenshen_sx on 2017/5/9.
 */
public class EventModel {

	private EventType eventType;
	private int actorId;
	private int entityId;
	private int entityType;
	private int entityOwnerId;

	Map<String, String> exts = new HashMap<>();

	public EventModel(EventType eventType){
		this.eventType = eventType;
	}
	public String getExt(String key) {
		return exts.get(key);
	}

	public EventModel setExt(String key, String value) {
		exts.put(key, value);
		return this;
	}

	public EventModel(){

	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public int getActorId() {
		return actorId;
	}

	public EventModel setActorId(int actorId) {
		this.actorId = actorId;
		return this;
	}

	public int getEntityId() {
		return entityId;
	}

	public EventModel setEntityId(int entityId) {
		this.entityId = entityId;
		return this;
	}

	public int getEntityType() {
		return entityType;
	}

	public EventModel setEntityType(int entityType) {
		this.entityType = entityType;
		return this;
	}

	public int getEntityOwnerId() {
		return entityOwnerId;
	}

	public EventModel setEntityOwnerId(int entityOwnerId) {
		this.entityOwnerId = entityOwnerId;
		return this;
	}

	public Map<String, String> getExts() {
		return exts;
	}

	public void setExts(Map<String, String> exts) {
		this.exts = exts;
	}



}
