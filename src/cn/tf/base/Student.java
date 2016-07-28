package cn.tf.base;

public class Student {
	
	private String name;
	
	private StudentListener listener;
	
	
	public Student(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name) {
		this.name = name;
	}

	public void study(){
		if(listener!=null){
			listener.preStudy(new StudentEvent(this));
		}
		System.out.println(name+"开始学习了");
	}
	
	public void sleep(){
		if(listener!=null){
			listener.preSleep(new StudentEvent(this));
		}
		System.out.println(name+"睡觉了");
	}
	
	public void addStudentListener(StudentListener listener){
		this.listener=listener;
	}
	
}
