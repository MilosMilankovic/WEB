package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import dao.ConnectionManager;


public class InitListener implements ServletContextListener {
	 @Override
	    public void contextInitialized(ServletContextEvent servletContextEvent) {
	        System.out.println("inicijalizacija...");
	        ConnectionManager.open();
	        System.out.println("završeno!");
	    }

	    @Override
	    public void contextDestroyed(ServletContextEvent servletContextEvent) {
	        ConnectionManager.close();
	    }	
}