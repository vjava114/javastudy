package JavaMail;

import java.io.File;


public interface KangMailSender {


	
	public void addFile(File f);
	
	public void sendMail(String msg, String title, String receiverAddr);
	public void sendMail(String msg, String title, String[] receiverAddr);


	

}
