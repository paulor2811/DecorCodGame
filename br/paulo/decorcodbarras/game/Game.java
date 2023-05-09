package br.paulo.decorcodbarras.game;

import java.util.Random;

import br.paulo.decorcodbarras.gui.Screen;
import br.paulo.decorcodbarras.gui.ScreenColor;
import br.paulo.decorcodbarras.loader.LoadText;

public class Game {
	private String[] text = new String[50];
	private LoadText lt = new LoadText();
	private String textCod;
	private String[] substrings;
	private Random random;
	private int sort;
	private Screen sc = new Screen();
	public Game() {
		while(true) {
			new ScreenColor(sc.frame);
			text = lt.LoadText();
			textCod = text[Sort(lt.getNumLine())];
			substrings = textCod.split("/");
			sort = Sort(2);
			if(sort == 0) {
				sc.setTextLabel(substrings[0]);
				sc.setTextField(substrings[1]);
				sc.setEnabledField(false);
				sc.setTextFieldBorder(false);
			} else if(sort == 1) {
				sc.setTextLabel(substrings[0]);
				sc.setTextField("");
				sc.setEnabledField(true);
				sc.setTextFieldBorder(true);
			}
			
			//System.out.println("br.paulo.decorcodbarras.game.Game.Game: String substring: " + substrings[0]);
			Delay(3000);
		}
	}
	private int Sort(int range) {
		random = new Random();
		int numeroAleatorio = random.nextInt(range);
		//System.out.println("br.paulo.decorcodbarras.game.Game.SortCod: String text: " + text[numeroAleatorio]);
		return numeroAleatorio;
	}
	private void Delay(int delay) {
		try {
	        Thread.sleep(delay); // delay de 3 segundos (3000 milissegundos)
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}
