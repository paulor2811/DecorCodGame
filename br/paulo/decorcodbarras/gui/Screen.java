package br.paulo.decorcodbarras.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;

public class Screen {
    public JFrame frame;
    public ScreenLabel sl;
    public ScreenTextField stf;

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

        sl = new ScreenLabel(frame, gbc);
        stf = new ScreenTextField(frame, gbc);

        frame.setVisible(true);
    }

    public void setTextLabel(String text) {
        sl.setText(text);
    }
    public void setTextField(String text) {
    	stf.setText(text);
    }
    public void setEnabledField(boolean bool) {
    	stf.setEnabledField(bool);
    }
    public void setTextFieldBorder(boolean bool) {
    	stf.setBorder(bool);
    }
}