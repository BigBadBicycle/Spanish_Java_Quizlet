package main;

import java.io.FileNotFoundException;

import main.graphics.QuizletFrame;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		AssetLoader.loadAssets();
		new QuizletFrame();

	}

}
