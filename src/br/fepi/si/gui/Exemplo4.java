package br.fepi.si.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Exemplo de captura simples de um evento 
 * @author Luiz Fernando
 *
 */
public class Exemplo4 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	JButton bt;
	
	public Exemplo4(){
		super("Eventos");
		
		bt = new JButton("Clique");
		getContentPane().add(bt); 
		bt.addActionListener(this); //método que captura o evento e 
									//busca uma implementação para o mesmo
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo4();
	}

	@Override //Método que que realiza a ação 
	public void actionPerformed(ActionEvent e) {
		System.out.println("Estou ouvindo!");
		bt.setText("Fui clicado!");
		bt.setBackground(Color.BLUE);
	}
}
