package br.paulo.decorcodbarras.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScreenResult {
	public JLabel labelResultado;
	public ScreenResult(JFrame frame, GridBagConstraints gbc) {
		labelResultado = new JLabel();

		labelResultado.setBackground(Color.GREEN);
		
        // Define a fonte do texto
        Font font = new Font("Arial", Font.BOLD, 40);
        labelResultado.setFont(font);
     
        gbc.anchor = GridBagConstraints.CENTER; // Centraliza horizontalmente e verticalmente
        gbc.insets = new Insets(-300, 0, 0, 0); // Margem inferior de 40 pixels
        
        frame.add(labelResultado, gbc);
	}
}
