/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.common;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author Nishi
 */
public class EmailAuthenticator extends Authenticator{
    
    public static final String SMTP_AUTH_USER = "mayrajain11@gmail.com";                                 
    public static final String SMTP_AUTH_PWD  = "Nishi@1129"; 
    
           @Override                                                                                                                   
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username, password);                                             
    }  
                
}
