package cn.tf.base;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {
	
	public static void main(String[] args) {
		Frame f=new Frame("窗口");
		f.setSize(600,400);
		
		
		//注册监听器
		f.addWindowListener(new MyWindowListener());
		f.setVisible(true);
		
	}
		
	}
	

	class MyWindowListener extends WindowAdapter{
		@Override
		public void windowClosed(WindowEvent e) {
			Frame f=(Frame) e.getSource();
			f.dispose();
			
		}
	}
	
	/*class MyWindowListener  implements  WindowListener{

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			Frame f=(Frame) e.getSource();
			f.dispose();
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
*/

