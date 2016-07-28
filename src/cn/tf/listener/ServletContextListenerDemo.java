package cn.tf.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerDemo implements ServletContextListener{

	//完成系统的清理工作
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("销毁了");
		
	}

	
	//完成系统初始化工作
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		System.out.println("初始化");
	}

	

}
