package br.paulo.decorcodbarras.game;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
	private boolean enterPressed = false;
	private Screen screen = new Screen();
	public Game() {
		while(true) {
			new ScreenColor(screen.frame);
			text = lt.LoadText();
			textCod = text[Sort(lt.getNumLine())];
			substrings = textCod.split("/");
			sort = Sort(2);
			if(sort == 0) {
				screen.screenLabel.label.setText(substrings[0]);
				screen.screenTextField.textField.setText(substrings[1]);
				screen.screenTextField.textField.setEnabled(false);
				screen.screenTextField.setTextFieldBorder(false);
				Delay(Sort(1800000));
			} else if(sort == 1) {
				screen.screenLabel.label.setText(substrings[0]);
				screen.screenTextField.textField.setText("");
				screen.screenTextField.textField.setEnabled(true);
				screen.screenTextField.setTextFieldBorder(true);
				EnterPressed();
				Delay(5000);
				screen.screenResult.labelResultado.setText("");//Apaga o label
			}
			//System.out.println("br.paulo.decorcodbarras.game.Game.Game: String substring: " + substrings[0]);
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
			long ms = delay; // tempo em milissegundos
			long minutos = ms / (60 * 1000); // converte para minutos
			System.out.println("Time: " + minutos + " minutos");
			
	        Thread.sleep(delay); // delay de 3 segundos (3000 milissegundos)
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	//Adiciona um listener para escreenutar a tecla enter na JTextField, o loop só continua após seu pressionamento
	public void EnterPressed() {
        screen.screenTextField.textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    synchronized (Game.this) {
                        enterPressed = true;
                        
                        if(substrings[1].equals(screen.screenTextField.textField.getText())) {
                        	System.out.println("Correto: " + substrings[1] + " == " + screen.screenTextField.textField.getText());
                        	screen.screenResult.labelResultado.setText("Correto!!!");
                        	screen.screenResult.labelResultado.setForeground(Color.BLUE);
                        } else {
                        	System.out.println("Incorreto: " + substrings[1] + " != " + screen.screenTextField.textField.getText());
                        	screen.screenResult.labelResultado.setText("Incorreto!!!");
                        	screen.screenResult.labelResultado.setForeground(Color.RED);
                        }
                    	
                        Game.this.notify();
                    }
                }
            }
        });
		while (!enterPressed) {
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // continua o loop aqui quando a tecla Enter foi pressionada

        enterPressed = false; // reseta o valor de enterPressed
    }
}
