package br.paulo.decorcodbarras.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;

public class Screen {
    public JFrame frame;
    public ScreenLabel screenLabel;
    public ScreenTextField screenTextField;
    public ScreenResult screenResult;
    public ScreenMenu screenMenu;
    
    public Screen() {
        frame = new JFrame("Game");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // configura o layout do frame com o GridBagLayout
        frame.setLayout(new GridBagLayout());

        // cria um objeto GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;

        screenLabel = new ScreenLabel(frame, gbc);
        screenTextField = new ScreenTextField(frame, gbc);
        screenResult = new ScreenResult(frame, gbc);
        screenMenu = new ScreenMenu(frame, gbc);

        frame.setVisible(true);
    }
}