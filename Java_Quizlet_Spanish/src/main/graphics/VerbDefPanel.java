package main.graphics;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;

import main.AssetLoader;
import main.VerbHandling;

public class VerbDefPanel extends MainPanel{
	
	private ArrayList<String[]> verbDefList = new ArrayList<String[]>(AssetLoader.VERB_DEF_LIST);
	private String[] currentVerb;

	VerbDefPanel(QuizletFrame pFrame) {
		super(pFrame);
		currentVerb = VerbHandling.getRandomVerb(verbDefList, VerbHandling.REPEATS);
		super.updateQuestionText(currentVerb[1]);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== super.buttons[7]) {
			if(super.answerBox.getText().toLowerCase().equals(currentVerb[2])) {
				System.out.println("Correct!");
			} else {
				System.out.println("False");
			}
		}
	}
	
	
	
	

}
