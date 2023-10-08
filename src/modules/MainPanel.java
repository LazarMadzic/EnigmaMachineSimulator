package modules;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


public class MainPanel extends JPanel{
	private static LetterGrid inputGrid = new LetterGrid(Color.GREEN);
	private static LetterGrid outputGrid = new LetterGrid(Color.YELLOW);
	
	public MainPanel() {
		System.out.println("ENTER key pressed");
		this.setLayout(new GridLayout(2, 1));
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.add(outputGrid);
		this.add(inputGrid);
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
//				if(Character.isLetter(e.getKeyChar())) {
//					inputGrid.selectButton(e);
//				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(Character.isLetter(e.getKeyChar())) {
					inputGrid.selectButton(e);
				}
			}
		});
	}
}
