package br.fepi.si.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Exemplo com 2 Layouts
 * @author Luiz Fernando
 *
 */
public class Exemplo3b extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public Exemplo3b(){
		super("Janela 2");
		
		Container c = getContentPane(); 
		c.setBackground(Color.RED);
		
		c.setLayout(new BorderLayout(5,5)); //Espaçamento
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("E"));
		c.add(BorderLayout.WEST, new JButton("W")); 
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo3b();
	}
}

