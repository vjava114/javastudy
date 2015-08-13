package JavaMail;

import java.io.File;
import java.io.PrintStream;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GMailSenderImpl  implements KangMailSender{

	private final static String FROM = "vjava114@gmail.com";
	private final static String USERNAME = "vjava114";
	private final static String PASSWORD = "Wnsdud12!";
	private final static String FROM_NICK = "������";
	
	
	private static Properties PROPS = null;
	private static Session SESSION = null;

	private static GMailSenderImpl impl = null;
	
	
	public static synchronized GMailSenderImpl getInstance(){
		
		if(impl ==null){
			impl = new GMailSenderImpl();
		}
		return impl;
	}
	
	
	private GMailSenderImpl() {
		
		// �ӽ÷� �ۼ��غ���. �귣ġ�� �ٲ㼭. localDev2��.
		// ������ ������ �Ͼ��, ������ �Ǿ��ٰ� ���� ���ʿ� > ǥ�ð� �߰� �� ���̴�.
		// �ٽü���
		// �ٽü���2
		// �ٽü���3
	
	      PROPS = new Properties();
	      PROPS.put("mail.smtp.auth", "true");
	      PROPS.put("mail.smtp.starttls.enable", "true");
	      PROPS.put("mail.smtp.host", "smtp.gmail.com");
	      PROPS.put("mail.smtp.port", "587");
	      
	      // Get the Session object.
	      SESSION = Session.getInstance(PROPS,
	      new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(USERNAME, PASSWORD);
	         }
	      });

	      SESSION.setDebug(true);
	}
	
	
	
	
	
	public void addFile(File f) {

		
	}

	public void sendMail(String msg_, String title_, String receiverAddr_) {

		String[] rcv = new String[]{receiverAddr_};
		
		sendExcecute(msg_, title_, rcv);

	}

	public void sendMail(String msg_, String title_, String[] receiverAddr_) {
		// TODO Auto-generated method stub
		
		sendExcecute(msg_, title_, receiverAddr_);
	}


	
	private static void sendExcecute(String msg_, String title_, String[] receiverAddr_){
	      try {
		         // Create a default MimeMessage object.
		         Message message = new MimeMessage(SESSION);

		         // Set From: header field of the header.
		         message.setFrom(new InternetAddress(FROM));

		         // Set To: header field of the header.
		         InternetAddress[] toAddr = InternetAddress.parse(receiverAddr_[0]);
		         message.setRecipients(Message.RecipientType.TO,  toAddr);

		         
		         
		         
		         // Set Subject: header field
		         message.setSubject(title_);

		         // Now set the actual message
		         message.setText(msg_);

		         // Send message
		         Transport.send(message);

		         System.out.println("Sent message successfully....");

		      } catch (MessagingException e) {
		            throw new RuntimeException(e);
		      }
	}


}
