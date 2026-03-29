package main.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener{
	
	/*Colors to use:
	 * 
	 * Beige: (246,240,215)
	 * Greens: (197, 216, 157), (156, 171, 132), (137, 152, 109)
	 * 
	 */
	private static final String A_ACCENT = "\u00E1";
	private static final String E_ACCENT = "\u00E9";
	private static final String I_ACCENT = "\u00ED";
	private static final String O_ACCENT = "\u00F3";
	private static final String U_ACCENT = "\u00FA";
	private static final String ENYAY = "\u00F1";
	
	private JTextField answerBox;
	private JPanel TopPanel;
	private JPanel BottomPanel;
	
	private JButton[] buttons;
	
	private BorderLayout layout = new BorderLayout();
	
	private QuizletFrame pFrame;
	
	
	MainPanel(QuizletFrame pFrame){
		
		this.pFrame = pFrame;
		answerBox = new JTextField();
		TopPanel = new JPanel();
		BottomPanel = new JPanel();
		
		this.setSize(500, 500);
		this.setBackground(new Color(197, 216, 157));
		this.setLayout(layout);

		answerBox.setBackground(new Color(246,240,215));
		answerBox.setFont(new Font("Roboto",Font.BOLD, 20));
		answerBox.addActionListener(this);
		
		TopPanel.setPreferredSize(new Dimension(pFrame.getWidth(), 200));
		TopPanel.setBackground(new Color(197, 216, 157));
		BottomPanel.setPreferredSize(new Dimension(pFrame.getWidth(), 150));
		BottomPanel.setBackground(new Color(197, 216, 157));
		
		
		buttons = new JButton[7];
		buttons[0] = new JButton(A_ACCENT);
		buttons[1] = new JButton(E_ACCENT);
		buttons[2] = new JButton(I_ACCENT);
		buttons[3] = new JButton(O_ACCENT);
		buttons[4] = new JButton(U_ACCENT);
		buttons[5] = new JButton(ENYAY);
		buttons[6] = new JButton("Menu");
		
		for(int i = 0; i<buttons.length; i++) {
			buttons[i].setFont(new Font("Roboto",Font.BOLD, 15));
			buttons[i].setFocusable(false);
			buttons[i].setBackground(new Color(246,240,215));
			buttons[i].addActionListener(this);
			BottomPanel.add(buttons[i]);
		}
		
		this.add(answerBox,BorderLayout.CENTER);
		this.add(TopPanel, BorderLayout.NORTH);
		this.add(BottomPanel, BorderLayout.SOUTH);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== buttons[0]) {
			answerBox.setText(answerBox.getText()+A_ACCENT);
		}
		if(e.getSource()== buttons[1]) {
			answerBox.setText(answerBox.getText()+E_ACCENT);
		}
		if(e.getSource()== buttons[2]) {
			answerBox.setText(answerBox.getText()+I_ACCENT);
		}
		if(e.getSource()== buttons[3]) {
			answerBox.setText(answerBox.getText()+O_ACCENT);
		}
		if(e.getSource()== buttons[4]) {
			answerBox.setText(answerBox.getText()+U_ACCENT);
		}
		if(e.getSource()== buttons[5]) {
			answerBox.setText(answerBox.getText()+ENYAY);
		}
		if(e.getSource()== buttons[6]) {
			pFrame.switchToMenu();
		}
		if(e.getSource() == answerBox) {

		}
	}

}
