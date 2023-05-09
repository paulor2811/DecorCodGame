package br.paulo.decorcodbarras.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import br.paulo.decorcodbarras.Main;

public class LoadText {
	private int numLine;
	private String[] line = new String[50];
	public String[] LoadText() {
		InputStream inputStream = Main.class.getResourceAsStream("/br/paulo/decorcodbarras/codigos/codigos.txt");
		StringBuilder sb = new StringBuilder();
		numLine = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
		    while ((line[numLine] = br.readLine()) != null) {
		        System.out.println("br.paulo.decorcodbarras.loader.LoadText: String line: " + line[numLine]);
		    	numLine++;
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
		return line;
	}
	public int getNumLine() {
		return numLine;
	}
}
