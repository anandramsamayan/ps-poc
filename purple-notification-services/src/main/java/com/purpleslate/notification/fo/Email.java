package com.purpleslate.notification.fo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Email {
	
	private String from;
	private List<String> to;
	private List<String> cc;
	private String subject;
	private boolean isHtml;
	private String ip_pool;
	private String send_at;
	private String futureDate;
	private String channelName;
	private Map<String, String> replacements ;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public List<String> getTo() {
		return to;
	}
	public void setTo(List<String> to) {
		this.to = to;
	}
	public List<String> getCc() {
		return cc;
	}
	public void setCc(List<String> cc) {
		this.cc = cc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean isHtml() {
		return isHtml;
	}
	public void setHtml(boolean isHtml) {
		this.isHtml = isHtml;
	}
	

	public String getIp_pool() {
		return ip_pool;
	}
	public void setIp_pool(String ip_pool) {
		this.ip_pool = ip_pool;
	}
	public String getSend_at() {
		return send_at;
	}
	public void setSend_at(String send_at) {
		this.send_at = send_at;
	}
	public String getFutureDate() {
		return futureDate;
	}
	public void setFutureDate(String futureDate) {
		this.futureDate = futureDate;
	}
	public Map<String, String> getReplacements() {
		return replacements;
	}
	public void setReplacements(Map<String, String> replacements) {
		this.replacements = replacements;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	
		

	
		}
		
		
