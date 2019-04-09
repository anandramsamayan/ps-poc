package com.purpleslate.notification.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.purpleslate.notification.fo.SMS;

@Component
public class AppSMSSender {
	
	 
	
		public String sendSms(String apiKey,String message,String sender,String numbers,SMS sms) {
			try {
				// Construct data hardcoded for now 
				apiKey = "apikey=" + "yourapiKey";
				message = "&message=" + "This is your message";
				sender = "&sender=" + "TXTLCL";
				numbers = "&numbers=" + "918123456789";
				String smsGatewayEndpoint = "https://api.textlocal.in/send/?";// can be pulled from config
				
				// Send data
				HttpURLConnection conn = (HttpURLConnection) new URL(smsGatewayEndpoint).openConnection();
				String data = apiKey + numbers + message + sender;
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
				conn.getOutputStream().write(data.getBytes("UTF-8"));
				final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				final StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = rd.readLine()) != null) {
					stringBuffer.append(line);
				}
				rd.close();
				
				return stringBuffer.toString();
			} catch (Exception e) {
				System.out.println("Error SMS "+e);
				return "Error "+e;
			}
		}
	}

