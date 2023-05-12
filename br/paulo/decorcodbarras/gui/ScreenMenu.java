package br.paulo.decorcodbarras.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class ScreenMenu {
	public ScreenMenu(JFrame frame, GridBagConstraints gbc) {
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(Color.BLACK);
		panel.setBackground(UIManager.getColor(Color.BLACK));
        panel.setBorder(null);
		
		//Cria um botao
		JButton botao = new JButton("     Menu     ");
		botao.setHorizontalAlignment(SwingConstants.CENTER);
		Font font = new Font("Arial", Font.BOLD, 14);
        botao.setFont(font);
		botao.setPreferredSize(new Dimension(90, 30));
		botao.setOpaque(false);
        botao.setBorder(null);
        
        botao.setBackground(Color.BLACK);
        botao.setBackground(UIManager.getColor(Color.BLACK));
        
		//Cria um JPopup para exibir as opções
		JPopupMenu menu = new JPopupMenu();
		JMenuItem opcao1 = new JMenuItem("opção 1");
		JMenuItem opcao2 = new JMenuItem("opção 2");
		JMenuItem opcao3 = new JMenuItem("opção 3");
		menu.add(opcao1);
		menu.add(opcao2);
		menu.add(opcao3);
		
		//Adiciona um ActionListener ao botão para exibir o JPopupMenu quando ele for clicado
		botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.show(botao, 0, botao.getHeight());
            }
        });
		
		//Adiciona o botao ao painel
		panel.add(botao);
		
		gbc.anchor = GridBagConstraints.FIRST_LINE_START; // Centraliza horizontalmente
        gbc.insets = new Insets(0, 0, 0, 0); // Adiciona margem superior de 30 pixels
		
		frame.add(panel, gbc);
	}
}
