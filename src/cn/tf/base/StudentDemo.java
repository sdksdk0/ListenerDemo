package cn.tf.base;

public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s=new Student("张三");
		
		//注册监听器
		s.addStudentListener(new MyStudentListener());
		
		s.study();
		s.sleep();

	}


}

	class MyStudentListener implements  StudentListener{

		@Override
		public void preStudy(StudentEvent e) {
			Student s=(Student) e.getSource();
			System.out.println(s.getName()+"认真学习");	
		}

		@Override
		public void preSleep(StudentEvent e) {
			Student s=(Student) e.getSource();
			System.out.println(s.getName()+"早点休息");	
			
		}
		
		
	}