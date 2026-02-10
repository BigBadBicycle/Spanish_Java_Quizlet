package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel implements ActionListener{
	
	private JButton verbDefB;
	private JButton conjugationB;
	
	private JPanel settingsP;
	private JButton[] ConjSettingsBs;
	
	MenuPanel(){
		
		settingsP = new JPanel();
		verbDefB = new JButton();
		conjugationB = new JButton();
		ConjSettingsBs = new JButton[3];
		
		this.setSize(500,500);
		this.setBackground(new Color(197, 216, 157));
		this.setLayout(new BorderLayout());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
	

