package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	
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
	private static final String ENYA = "\u00F1";
	
	private JTextField answerBox;
	private JPanel TopPanel;
	private JPanel BottomPanel;
	
	private BorderLayout layout = new BorderLayout();
	
	
	MainPanel(QuizletFrame pFrame){
		
		answerBox = new JTextField();
		TopPanel = new JPanel();
		BottomPanel = new JPanel();
		
		this.setSize(500, 500);
		this.setBackground(new Color(197, 216, 157));
		this.setLayout(layout);

		answerBox.setBackground(new Color(246,240,215));
		answerBox.setFont(new Font("Roboto",Font.BOLD, 20));
		
		TopPanel.setPreferredSize(new Dimension(pFrame.getWidth(), 200));
		TopPanel.setBackground(new Color(197, 216, 157));
		BottomPanel.setPreferredSize(new Dimension(pFrame.getWidth(), 150));
		BottomPanel.setBackground(new Color(197, 216, 157));
		
		this.add(answerBox,BorderLayout.CENTER);
		this.add(TopPanel, BorderLayout.NORTH);
		this.add(BottomPanel, BorderLayout.SOUTH);
		
		
		
	}

}
