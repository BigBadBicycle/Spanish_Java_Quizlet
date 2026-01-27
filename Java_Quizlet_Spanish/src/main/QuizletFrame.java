package main;

import java.awt.Color;

import javax.swing.JFrame;

public class QuizletFrame extends JFrame{
	
	QuizletFrame(){
		
		this.setSize(800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(137, 152, 109));
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Spanish Studying!");
		
		this.add(new MainPanel());
		
		this.setVisible(true);
		
	}
	

}
