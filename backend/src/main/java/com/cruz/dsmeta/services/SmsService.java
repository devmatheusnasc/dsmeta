package com.cruz.dsmeta.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cruz.dsmeta.domain.Sale;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SmsService {

	@Value("${twilio.sid}")
	private String twilioSid;

	@Value("${twilio.key}")
	private String twilioKey;

	@Value("${twilio.phone.from}")
	private String twilioPhoneFrom;

	@Value("${twilio.phone.to}")
	private String twilioPhoneTo;

	public void sendSms(Sale obj) {

		String date = obj.getDate().getMonthValue() + "/" + obj.getDate().getYear();

		String msg = "O Vendedor " + obj.getSellerName()
			+ " foi destaque em " + date + " com um total de R$ "
			+ String.format("%.2f", obj.getAmount());

		Twilio.init(twilioSid, twilioKey);

		PhoneNumber to = new PhoneNumber(twilioPhoneTo);
		PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

		Message message = Message.creator(to, from, msg).create();

		System.out.println(message.getSid());
	}
}
