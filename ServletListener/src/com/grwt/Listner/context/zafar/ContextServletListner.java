package com.grwt.Listner.context.zafar;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ContextServletListner implements ServletContextListener {

   
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("context is destroyed");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("context is initilised");

    }
	
}
