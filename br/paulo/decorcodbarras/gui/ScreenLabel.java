package br.paulo.decorcodbarras.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScreenLabel {
	public JLabel label;
	public ScreenLabel(JFrame frame, GridBagConstraints gbc) {
		label = new JLabel();

        // Define a cor do texto
        label.setForeground(Color.WHITE);

        // Define a fonte do texto
        Font font = new Font("Arial", Font.PLAIN, 25);
        label.setFont(font);
     
        gbc.anchor = GridBagConstraints.CENTER; // Centraliza horizontalmente e verticalmente
        gbc.insets = new Insets(-20, 0, 0, 0); // Margem inferior de 40 pixels
        
        frame.add(label, gbc);
	}
}
