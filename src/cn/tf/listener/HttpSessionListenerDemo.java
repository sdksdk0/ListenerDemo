package cn.tf.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpSessionListenerDemo implements HttpSessionListener{

	
	
	//统计网站访问次数
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(se.getSession()+"创建了");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(se.getSession()+"销毁了");
		
	}

}
