import java.util.Properties;  
    import javax.mail.*;  
    import javax.mail.internet.*;  
public class Mailer {
	public static void send(String gmail,String msg,String roll)
	{
		//String to="newjava4u@gmail.com";//change accordingly  
	      String to=gmail;
	      //Get the session object  
	      Properties props = new Properties();  
	      props.put("mail.smtp.host", "smtp.gmail.com");  
	      props.put("mail.smtp.socketFactory.port", "465");  
	      props.put("mail.smtp.socketFactory.class",  
	                "javax.net.ssl.SSLSocketFactory");  
	      props.put("mail.smtp.auth", "true");  
	      props.put("mail.smtp.port", "465");  
	       
	      Session session = Session.getDefaultInstance(props,  
	       new javax.mail.Authenticator() {  
	       protected PasswordAuthentication getPasswordAuthentication() {  
	       return new PasswordAuthentication("xxxxx@gmail.com","password");//change accordingly  
	       }  
	      });  
	       
	      //compose message  
	      try {  
	       MimeMessage message = new MimeMessage(session);  
	       message.setFrom(new InternetAddress("1996rajatbansal@gmail.com"));//change accordingly  
	       message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	       message.setSubject("open elective");  
	//String name="physics";
	       message.setText("Dear "+roll+" Your Alloted Open Elective Is "+msg);  
	         
	       //send message  
	       Transport.send(message);  
	      
	       System.out.println("message sent successfully");  
	       
	      } catch (MessagingException e) {throw new RuntimeException(e);}  
	       
	}

}
