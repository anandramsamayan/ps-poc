package com.purpleslate.notification.fo;

public class SMS {
	
	
	private String sender;
	private String number;
	private String isBulk;
	private String[] numbers;
	private String[] inboxIds;
	private SMSGroup smsgroup;
	private SMSContacts smsContacts;
	private SMSGroup[] smsgroups;
	private String channelName;
	
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIsBulk() {
		return isBulk;
	}
	public void setIsBulk(String isBulk) {
		this.isBulk = isBulk;
	}
	public String[] getNumbers() {
		return numbers;
	}
	public void setNumbers(String[] numbers) {
		this.numbers = numbers;
	}
	public SMSGroup getSmsgroup() {
		return smsgroup;
	}
	public void setSmsgroup(SMSGroup smsgroup) {
		this.smsgroup = smsgroup;
	}
	public SMSContacts getSmsContacts() {
		return smsContacts;
	}
	public void setSmsContacts(SMSContacts smsContacts) {
		this.smsContacts = smsContacts;
	}
	public SMSGroup[] getSmsgroups() {
		return smsgroups;
	}
	public void setSmsgroups(SMSGroup[] smsgroups) {
		this.smsgroups = smsgroups;
	}
	public String[] getInboxIds() {
		return inboxIds;
	}
	public void setInboxIds(String[] inboxIds) {
		this.inboxIds = inboxIds;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
}
