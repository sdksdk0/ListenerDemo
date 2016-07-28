package cn.tf.domain;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;



public class User implements Serializable, HttpSessionBindingListener {

	private String username;
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("绑定");
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("解绑");
		
	}
	
	
	

}
