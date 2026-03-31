package main.graphics;

import java.util.ArrayList;

import javax.swing.JButton;

import main.AssetLoader;
import main.VerbHandling;

public class VerbDefPanel extends MainPanel{
	
	private ArrayList<String[]> verbDefList = new ArrayList<String[]>(AssetLoader.VERB_DEF_LIST);
	private String[] currentVerb;
	
	private int tries = 3;

	VerbDefPanel(QuizletFrame pFrame) {
		super(pFrame);
		currentVerb = VerbHandling.getRandomVerb(verbDefList, VerbHandling.REPEATS);
		super.updateQuestionText(currentVerb[1]);
		super.updateResponseText("You have "+tries+" left.");
		
		super.buttons[7].addActionListener( e -> {
			if(super.answerBox.getText().toLowerCase().equals(currentVerb[2])) {
				currentVerb = VerbHandling.getRandomVerb(verbDefList, VerbHandling.REPEATS);
				super.updateQuestionText(currentVerb[1]);
				tries = 3;
				super.updateResponseText("Correct! You have "+tries+" tries left.");
			} else {
				if(tries-1 <= 0) {
					String[] temp = currentVerb;
					super.updateResponseText(temp[1]+" defintion is: "+temp[2]);
					currentVerb = VerbHandling.getRandomVerb(verbDefList, VerbHandling.REPEATS);
					super.updateQuestionText(currentVerb[1]);
					tries = 3;
				} else {
					tries--;
					super.updateResponseText("Wrong, you have "+tries+" left");
				}
			}
		});
	}
}
