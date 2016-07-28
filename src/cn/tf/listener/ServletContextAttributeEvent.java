package cn.tf.listener;

import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttributeEvent  implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(javax.servlet.ServletContextAttributeEvent event) {
		System.out.println("增加了新属性");
		
	}

	@Override
	public void attributeRemoved(
			javax.servlet.ServletContextAttributeEvent event) {
		System.out.println("属性被移除了");
		
	}

	@Override
	public void attributeReplaced(
			javax.servlet.ServletContextAttributeEvent event) {
		System.out.println("属性被替换了");
		
	}

}
