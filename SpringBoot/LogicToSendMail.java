package com.sendMail;

import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

//First part to send mail without attachment

//import org.springframework.mail.MailSender;
//import org.springframework.mail.SimpleMailMessage;
//
//public class LogicToSendMail {
//
//	private MailSender mail;
//	
//	public void setMail(MailSender mail) {
//		this.mail=mail;
//	}
//	public void sendM(String to, String subject,String msg) {
//		SimpleMailMessage message = new SimpleMailMessage();
//		
//		message.setTo(to);
//		message.setSubject(subject);
//		message.setText(msg);
//		
//		mail.send(message);
//		System.out.println("Mail Sent!!!");
//		
//		
//	}
//}

public class LogicToSendMail {
	private JavaMailSender mail;
	public void setMail(JavaMailSender mail) {
		this.mail=mail;	
	}
	
	public void sendM(String receiver,String subject,String msg) {
		//SimpleMailMessage message = new SimpleMailMessage();
		try {
			MimeMessage mimeMessage = mail.createMimeMessage();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			mimeMessageHelper.setTo(receiver);
			mimeMessageHelper.setSubject(subject);
			mimeMessageHelper.setText(msg);
			FileSystemResource file = new FileSystemResource("C:\\Users\\sivak\\Downloads\\Ganapati.png");
			mimeMessageHelper.addAttachment(file.getFilename(), file);
			
		    mail.send(mimeMessage);
			System.out.println("Mail Sent!!");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
