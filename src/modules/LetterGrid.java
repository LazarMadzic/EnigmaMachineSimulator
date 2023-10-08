package modules;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LetterGrid extends JPanel {
	private Color defaultColor = Color.gray;
	private Color selectedColor;
	private ArrayList<String>  letterList =  new ArrayList<String>( Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" ));
	private ArrayList<JButton> buttonList = new ArrayList<JButton>();
	private boolean isSelected = false;
	private KeyEvent lastSelectedKey = null; 
	
	
	public LetterGrid(Color sColor) {
		this.selectedColor = sColor;
		this.setLayout(new GridLayout(2,13));
		this.setPreferredSize(new Dimension(1000,150));
		for (int i = 0; i < letterList.size(); i++) {
			JButton tempButton = new JButton(letterList.get(i));
			tempButton.setBorder(BorderFactory.createEmptyBorder());
			buttonList.add(tempButton);
			this.add(tempButton);
		}
	}
	
	public void selectButton(KeyEvent e) {
		if(lastSelectedKey == null)lastSelectedKey = e;
		else {
			int currentIndex = e.getKeyCode() - 65;
			int lastIndex = lastSelectedKey.getKeyCode() - 65;
			if(lastSelectedKey.getKeyCode() != e.getKeyCode()) {
				lastSelectedKey = e;
				buttonList.get(lastIndex).setBorder(BorderFactory.createEmptyBorder());
				buttonList.get(currentIndex).setBorder(BorderFactory.createLineBorder(selectedColor, 2));	
			}
		} 
			
	}
}
