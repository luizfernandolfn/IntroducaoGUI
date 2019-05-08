package br.fepi.si.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Exemplo com 2 Layouts
 * 
 * @author Luiz Fernando
 *
 */
public class Exemplo3c extends JFrame {

	private static final long serialVersionUID = 1L;

	public Exemplo3c() {
		super("Janela 2");
		Container c = getContentPane();
		c.setBackground(Color.RED);
		Container c2 = new JPanel(); // Adicionando outro Layout
		c2.setLayout(new GridLayout(4, 1));// 4 linhas e 1 coluna

		// Inserindo outro Panel
		c.add(BorderLayout.CENTER, new JPanel().add(BorderLayout.CENTER, new JTextArea("Digite")));
		c.add(BorderLayout.EAST, c2); // Inserindo o grid do lado direito

		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));

		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo3c();
	}
}
