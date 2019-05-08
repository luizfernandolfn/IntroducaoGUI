package br.fepi.si.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * Exemplo de uso de Layouts
 * @author Luiz Fernando
 *
 */
public class Exemplo2a extends JFrame {
	
		private static final long serialVersionUID = 1L;

	public Exemplo2a(){
		super("Layouts");
		
		Container c = getContentPane(); //recuperando o container através de uma variável
		c.setLayout(new FlowLayout()); //Método que define o layout do container
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Exemplo2a();
	}

}
