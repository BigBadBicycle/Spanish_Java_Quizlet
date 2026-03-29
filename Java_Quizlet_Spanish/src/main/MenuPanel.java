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
		
		//constructs variables
		Title = new JLabel();
		settingsP = new JPanel();
		startP = new JPanel();
		verbDefB = new JButton();
		conjugationB = new JButton();
		ConjSettingsBs = new JButton[8];
		
		//All button options; each one will have options for irregular only
		//present
		//preterite
		//imperfect
		//future
		//conditional
		//present perfect
		//subjunctive (present)
		
		//title
		Title.setFont(new Font("Roboto",Font.BOLD, 50));
		Title.setText("Spanish Studying!");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		
		//start bottoms
		verbDefB.setFont(new Font("Roboto",Font.BOLD, 20));
		conjugationB.setFont(new Font("Roboto",Font.BOLD, 20));
		verbDefB.setPreferredSize(new Dimension(200,100));
		conjugationB.setPreferredSize(new Dimension(200,100));
		verbDefB.setBackground(new Color(246,240,215));
		conjugationB.setBackground(new Color(246,240,215));
		verbDefB.setFocusable(false);
		conjugationB.setFocusable(false);
		verbDefB.setLabel("Verb Definition");
		conjugationB.setLabel("Conjugation");
		
		//settings panel
		settingsP.setPreferredSize(new Dimension(pFrame.getWidth(), 150));
		settingsP.setBackground(new Color(156, 171, 132));
		settingsP.setLayout(new FlowLayout());
		
		//makes setting panel buttons
		ConjSettingsBs[0] = new JButton();
		ConjSettingsBs[1] = new JButton();
		ConjSettingsBs[2] = new JButton();
		ConjSettingsBs[3] = new JButton();
		ConjSettingsBs[4] = new JButton();
		ConjSettingsBs[5] = new JButton();
		ConjSettingsBs[6] = new JButton();
		ConjSettingsBs[7] = new JButton();
		
		for(int i = 0; i<ConjSettingsBs.length;i++) {
			ConjSettingsBs[i].setFocusable(false);
			ConjSettingsBs[i].setFont(new Font("Roboto",Font.BOLD, 8));
			ConjSettingsBs[i].setBackground(new Color(246,240,215));
			ConjSettingsBs[i].setPreferredSize(new Dimension(100,50));
			settingsP.add(ConjSettingsBs[i]);
		}
		
		ConjSettingsBs[0].setText("Present");
		ConjSettingsBs[1].setText("Preterite");
		ConjSettingsBs[2].setText("Imperfect");
		ConjSettingsBs[3].setText("Future");
		ConjSettingsBs[4].setText("Conditional");
		ConjSettingsBs[5].setText("Present Perfect");
		ConjSettingsBs[6].setText("Subjunctive");
		ConjSettingsBs[7].setText("Irregular Only");
		
		//makes start panel buttons
		startP.setBackground(new Color(197, 216, 157));
		startP.setLayout(new FlowLayout());
		startP.add(verbDefB);
		startP.add(conjugationB);
		
		//creates frame
		this.setSize(500,500);
		this.setBackground(new Color(197, 216, 157));
		this.setLayout(new BorderLayout());
		
		this.add(Title, BorderLayout.NORTH);
		this.add(startP, BorderLayout.CENTER);
		this.add(settingsP, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== verbDefB) {
			
		}
		if(e.getSource()== conjugationB) {
			
		}
		
	}
	
	
}
	

