package com.purpleslate.notification.fo;

public class ScheduledSMS  {
	private String id;
	private String scheduledFor;
	private String howmany;
	private String message;
	private String origin;
	private String groupName;
	private String groupid;
	private String toNumber;
	private String sendAt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getScheduledFor() {
		return scheduledFor;
	}
	public void setScheduledFor(String scheduledFor) {
		this.scheduledFor = scheduledFor;
	}
	public String getHowmany() {
		return howmany;
	}
	public void setHowmany(String howmany) {
		this.howmany = howmany;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getSendAt() {
		return sendAt;
	}
	public void setSendAt(String sendAt) {
		this.sendAt = sendAt;
	}
}
