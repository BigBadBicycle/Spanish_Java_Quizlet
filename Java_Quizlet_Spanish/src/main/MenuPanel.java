package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuPanel extends JPanel implements ActionListener{
	
	private JButton verbDefB;
	private JButton conjugationB;
	
	private JLabel Title;
	
	private JPanel settingsP;
	private JPanel startP;
	private JButton[] ConjSettingsBs;
	
	MenuPanel(QuizletFrame pFrame){
		
		settingsP = new JPanel();
		startP = new JPanel();
		verbDefB = new JButton();
		Title = new JLabel();
		conjugationB = new JButton();
		ConjSettingsBs = new JButton[3];
		
		Title.setFont(new Font("Roboto",Font.BOLD, 50));
		Title.setText("Spanish Studying!");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		
		verbDefB.setFont(new Font("Roboto",Font.BOLD, 20));
		conjugationB.setFont(new Font("Roboto",Font.BOLD, 20));
		verbDefB.setPreferredSize(new Dimension(200,100));
		conjugationB.setPreferredSize(new Dimension(200,100));
		verbDefB.setBackground(new Color(246,240,215));
		conjugationB.setBackground(new Color(246,240,215));
		
		
		settingsP.setPreferredSize(new Dimension(pFrame.getWidth(), 150));
		settingsP.setBackground(new Color(156, 171, 132));
		settingsP.setLayout(new FlowLayout());
		
		startP.setBackground(new Color(197, 216, 157));
		startP.setLayout(new FlowLayout());
		startP.add(verbDefB);
		startP.add(conjugationB);
		
		this.setSize(500,500);
		this.setBackground(new Color(197, 216, 157));
		this.setLayout(new BorderLayout());
		
		this.add(Title, BorderLayout.NORTH);
		this.add(startP, BorderLayout.CENTER);
		this.add(settingsP, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
	

