package edu.esprit.pidev.interfaces;

import javax.ejb.Remote;

@Remote
public interface IEmailSenderRemote {
	   public boolean SendMail(String from ,String password,String Subject ,String message,String to[]);


}
