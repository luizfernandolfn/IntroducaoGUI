package br.fepi.si.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 * Classe que monta uma tela simples de login
 * @author Luiz Fernando
 */
public class Exemplo6 extends JFrame{
	
	JButton ok = new JButton("Ok");
	JButton cancel = new JButton("Cancelar");
	JTextField login = new JTextField();
	JPasswordField senha = new JPasswordField();
	
	public Exemplo6() {
		super("Textos e senhas");	
		ok.addActionListener(new BotaoOkListener());
		cancel.addActionListener(new BotaoCancelarListener());
				
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Login"));
		c.add(login);
		c.add(new JLabel("Senha"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Exemplo6();
	}
	/**
	 * Classe que implementa o método apenas para os eventos do botão "Ok"
	 * @author 
	 */
	class BotaoOkListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String s = "Login: "+login.getText()+
					"\nSenha: "+new String(senha.getPassword());	
			JOptionPane.showMessageDialog(null, s);
		}
		
	}
	/**
	 * Classe que implementa o método apenas para os eventos do botão "Cancelar"
	 * @author leandro
	 */
	class BotaoCancelarListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			login.setText("");
			senha.setText("");			
		}
		
	}
	
	
}
