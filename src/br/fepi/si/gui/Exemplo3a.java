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
 * @author Luiz Fernando
 *
 */
public class Exemplo3a extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	
	public Exemplo3a(){
		super("Janela 2");
		
		Container c = getContentPane(); 
		c.setBackground(Color.RED);
		
		c.setLayout(new GridLayout(2,3));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		

	}

	public static void main(String[] args) {
		new Exemplo3a();

	}

}
