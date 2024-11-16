package com.lcwd;

import com.lcwd.email.GEmailSender;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Sending email module 123456");
        String message ="Hello Dear, this is message from Java Program";
        String subject = "Email thru Java Program";
        String to = "diptidesai04@gmail.com";
        String from ="diptidesai05@gmail.com";
        GEmailSender gEmailSender = new GEmailSender();
        boolean emailSent = gEmailSender.sendEmail(message, subject, to, from);
       
    }

	
}
