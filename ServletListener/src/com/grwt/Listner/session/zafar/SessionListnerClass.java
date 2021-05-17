package com.grwt.Listner.session.zafar;

//import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//@WebListener
public class SessionListnerClass implements HttpSessionListener {

   
  
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("Session is created ");
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("session is destroyed");
    }
	
}
