package JavaMail;

import java.io.File;


public class SampleSender {

	public static void main(String[] args) {


		KangMailSender sender = GMailSenderImpl.getInstance();
		
		sender.addFile(new File("a"));
		
		for(int i=0; i<2; i++){
			
			sender.sendMail("내용", "제목", "vjava114@gmail.com");
		}
		
		
		
	}
}
