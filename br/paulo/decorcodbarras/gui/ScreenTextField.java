package br.paulo.decorcodbarras.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ScreenTextField {
	public JTextField textField;
	public ScreenTextField(JFrame frame, GridBagConstraints gbc) {
		textField = new JTextField();

		// Define o tamanho preferido do JTextField
	    textField.setPreferredSize(new Dimension(150, 40));
	    
	    // Centraliza o texto horizontalmente e verticalmente
        textField.setHorizontalAlignment(JTextField.CENTER);
        
        //Deixa o JTextField completamente transparente
        textField.setOpaque(false);
        textField.setBackground(new Color(0,0,0,0));

        textField.setForeground(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 18);
        textField.setFont(font);
	    
        gbc.anchor = GridBagConstraints.CENTER; // Centraliza horizontalmente
        gbc.insets = new Insets(65, 0, 0, 0); // Adiciona margem superior de 30 pixels
        
		frame.add(textField, gbc);
	}
	public void setTextFieldBorder(boolean bool) {
		if(bool) {
			Border border = BorderFactory.createLineBorder(Color.BLACK); // Cria uma borda simples com cor preta
	        textField.setBorder(border);
		} else {
			textField.setBorder(null);
		}
	}
}
