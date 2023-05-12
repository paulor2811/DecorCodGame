package br.paulo.decorcodbarras.gui;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class ScreenColor {
	public ScreenColor(JFrame frame) {
		//frame.getContentPane().setBackground(RandomColor()); // define a cor de fundo aleatóriamente
		frame.getContentPane().setBackground(Color.BLACK); // define a cor de fundo
	}
	private Color  RandomColor() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(3);
		
		switch(numeroAleatorio) {
			case 0:
				return Color.blue;
			case 1:
				return Color.black;
			case 2: 
				return Color.red;
		}
		return Color.black;
	}
}
