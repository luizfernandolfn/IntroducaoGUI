package br.fepi.si.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Exemplo com Rótulo, fontes e imagens
 */
public class Exemplo5 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Exemplo5(){
		super("Exemplo Label");	
		Font f = new Font("serif", Font.BOLD | Font.ITALIC, 20);
		JLabel label = new JLabel("Rótulo Simples");
		label.setToolTipText("Dica do dia!");
		JLabel label2 = new JLabel("Rótulo Melhorado");
		
		label2.setFont(f);
		label2.setForeground(Color.ORANGE);
		
		ImageIcon img = new ImageIcon(getClass().getResource("img/grande-ideia.jpg"));
		JLabel label3 = new JLabel(img);
		label3.setToolTipText("grande-ideia.jpg");
		
		Container c = getContentPane();		
		c.setLayout(new FlowLayout());
		c.add(label);
		c.add(label2);
		c.add(label3);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo5();
	}
}
