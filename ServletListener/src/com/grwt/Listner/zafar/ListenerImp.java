package com.grwt.Listner.zafar;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
//import javax.servlet.annotation.WebListener;

/**
 * if any one want to run this program go to xml  then uncomment xml tag for this listner or uncomment this annotation  then enjoy
 */
//@WebListener
public class ListenerImp implements ServletRequestListener {

    /**
     */
    public ListenerImp() {
    }

	/**
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("Request Is destroyed");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("Request Is Initilized");

    }
	
}
