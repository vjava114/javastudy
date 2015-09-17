package com.util.javaMail;

import java.io.File;


public class SampleSender {

	public static void main(String[] args) {


		KangMailSender sender = GMailSenderImpl.getInstance();
		
		sender.addFile(new File("a"));
		sender.sendMail("내용", "제목", "vjava114@gmail.com");
		
		
		
	}
}
