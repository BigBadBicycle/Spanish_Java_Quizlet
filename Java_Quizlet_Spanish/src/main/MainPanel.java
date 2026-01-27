package main;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	
	/*Colors to use:
	 * 
	 * Beige: (246,240,215)
	 * Greens: (197, 216, 157), (156, 171, 132), (137, 152, 109)
	 * 
	 */
	
	
	JTextField answerBox;
	
	MainPanel(){
		
		answerBox = new JTextField();
		
		this.setBounds(65,55, 675, 650);
		this.setBackground(new Color(197, 216, 157));
		this.setLayout(null);
		
		answerBox.setBounds(175,300,400,100);
		answerBox.setBackground(new Color(246,240,215));
		
		this.add(answerBox);
		
		
	}

}
