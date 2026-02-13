package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class QuizletFrame extends JFrame{
	
	private QuizletFrame frame;
	private MainPanel main;
	private MenuPanel menu;
	
	QuizletFrame(){
		
		BorderLayout border = new BorderLayout();
		main = new MainPanel(this);
		menu = new MenuPanel(this);
		frame = this;
		
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.getContentPane().setBackground(new Color(137, 152, 109));
		this.setResizable(true);
		this.setLayout(border);
		this.setTitle("Spanish Studying!");
		
		this.add(menu, BorderLayout.CENTER);
		
		JPanel[] outer = new JPanel[4];
		for(int i =0; i<4; i++) {
			outer[i] = new JPanel();
			outer[i].setBackground(new Color(137,152,109));
		}
		this.add(outer[0],BorderLayout.NORTH);
		this.add(outer[1],BorderLayout.SOUTH);
		this.add(outer[2],BorderLayout.WEST);
		this.add(outer[3],BorderLayout.EAST);
		this.setVisible(true);
		
	}
	
	public void switchToMenu() {
		frame.remove(main);
		frame.add(menu, BorderLayout.CENTER);
		frame.repaint();
	}
	

}
