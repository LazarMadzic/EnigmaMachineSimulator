package main;

import javax.swing.*; 
import modules.*;

public class AppWindow {
	private static JFrame mainFrame=new JFrame();//creating instance of JFrame 
	public static void main(String[] args) {
		mainFrame.add(new MainPanel());
		mainFrame.setResizable(false);
		mainFrame.pack();
		mainFrame.setVisible(true);//making the frame visible 
	}
}
