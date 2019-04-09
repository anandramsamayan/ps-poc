package com.purpleslate.notification.fo;

import java.util.ArrayList;

public class Message {
	 private String html;
	 private String text;
	 private String subject;
	 private String from_email;
	 private String from_name;
	 private String mailContent;
	 ArrayList < Object > to = new ArrayList < Object > ();
	 Headers HeadersObject;
	 private boolean important;
	 private String track_opens = null;
	 private String track_clicks = null;
	 private String auto_text = null;
	 private String auto_html = null;
	 private String inline_css = null;
	 private String url_strip_qs = null;
	 private String preserve_recipients = null;
	 private String view_content_link = null;
	 private String bcc_address;
	 private String tracking_domain = null;
	 private String signing_domain = null;
	 


	 // Getter Methods 

	 public String getHtml() {
	  return html;
	 }

	 public String getText() {
	  return text;
	 }

	 public String getSubject() {
	  return subject;
	 }

	 public String getFrom_email() {
	  return from_email;
	 }

	 public String getFrom_name() {
	  return from_name;
	 }

	 public Headers getHeaders() {
	  return HeadersObject;
	 }

	 public boolean getImportant() {
	  return important;
	 }

	 public String getTrack_opens() {
	  return track_opens;
	 }

	 public String getTrack_clicks() {
	  return track_clicks;
	 }

	 public String getAuto_text() {
	  return auto_text;
	 }

	 public String getAuto_html() {
	  return auto_html;
	 }

	 public String getInline_css() {
	  return inline_css;
	 }

	 public String getUrl_strip_qs() {
	  return url_strip_qs;
	 }

	 public String getPreserve_recipients() {
	  return preserve_recipients;
	 }

	 public String getView_content_link() {
	  return view_content_link;
	 }

	 public String getBcc_address() {
	  return bcc_address;
	 }

	 public String getTracking_domain() {
	  return tracking_domain;
	 }

	 public String getSigning_domain() {
	  return signing_domain;
	 }

	

	 // Setter Methods 

	 public void setHtml(String html) {
	  this.html = html;
	 }

	 public void setText(String text) {
	  this.text = text;
	 }

	 public void setSubject(String subject) {
	  this.subject = subject;
	 }

	 public void setFrom_email(String from_email) {
	  this.from_email = from_email;
	 }

	 public void setFrom_name(String from_name) {
	  this.from_name = from_name;
	 }

	 public void setHeaders(Headers headersObject) {
	  this.HeadersObject = headersObject;
	 }

	 public void setImportant(boolean important) {
	  this.important = important;
	 }

	 public void setTrack_opens(String track_opens) {
	  this.track_opens = track_opens;
	 }

	 public void setTrack_clicks(String track_clicks) {
	  this.track_clicks = track_clicks;
	 }

	 public void setAuto_text(String auto_text) {
	  this.auto_text = auto_text;
	 }

	 public void setAuto_html(String auto_html) {
	  this.auto_html = auto_html;
	 }

	 public void setInline_css(String inline_css) {
	  this.inline_css = inline_css;
	 }

	 public void setUrl_strip_qs(String url_strip_qs) {
	  this.url_strip_qs = url_strip_qs;
	 }

	 public void setPreserve_recipients(String preserve_recipients) {
	  this.preserve_recipients = preserve_recipients;
	 }

	 public void setView_content_link(String view_content_link) {
	  this.view_content_link = view_content_link;
	 }

	 public void setBcc_address(String bcc_address) {
	  this.bcc_address = bcc_address;
	 }

	 public void setTracking_domain(String tracking_domain) {
	  this.tracking_domain = tracking_domain;
	 }

	 public void setSigning_domain(String signing_domain) {
	  this.signing_domain = signing_domain;
	 }

	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	
	}