package main;

import java.util.ArrayList;
import java.util.Random;

public class VerbHandling {
	
	public final static int PRESENT_CONJ = 1;
	public final static int PRETERITE_CONJ = 2;
	public final static int IMPERFECT_CONJ = 3;
	public final static int FUTURE_CONJ = 4;
	public final static int CONDITIONAL_CONJ = 5;
	public final static int PRESENT_PERFECT_CONJ = 6;
	public final static int SUBJUNCTIVE_CONJ = 7;
	public final static int IRREGULAR_ONLY_CONJ = 8;
	
	public final static boolean REPEATS = true;
	public final static boolean NO_REPEATS = false;
	
	
	public static String[] getRandomVerb(ArrayList<String[]> y,boolean canRepeat) {
		Random r = new Random();
		int ranIndex = r.nextInt(y.size());
		if(canRepeat) {
			return y.get(ranIndex);
		}
		String temp[] = y.get(ranIndex);
		y.remove(ranIndex);
		return temp;
	}

}
