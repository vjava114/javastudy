package com.util.javaMail;

import java.io.File;


public class SampleSender {

	public static void main(String[] args) {


		KangMailSender sender = GMailSenderImpl.getInstance();
		
		sender.addFile(new File("a"));
		
		for(int i=0; i<2; i++){
			
			sender.sendMail("����", "����", "vjava114@gmail.com");
		}
		
		
		
	}
}
