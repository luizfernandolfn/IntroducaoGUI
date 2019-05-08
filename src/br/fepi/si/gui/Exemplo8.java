package br.fepi.si.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Visualizador de texto simples com TextArea
 * @author Luiz Fernando
 *
 */
public class Exemplo8 extends JFrame implements ActionListener {
	
	JTextArea texto;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Exemplo8(){
		super("Visualizador de textos");
		
		Font f = new Font("Serif", Font.PLAIN, 20);
		
		texto = new JTextArea();		
		texto.setFont(f);
		texto.setEditable(false);//Impede a edição
		
		JScrollPane scroll = new JScrollPane(texto); //Barra de rolagem
		
		JButton abrir = new JButton("Abrir");
		abrir.setFont(f);
		abrir.addActionListener(this);
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, abrir);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exemplo8();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser fc = new JFileChooser(); //Escolhedor de arquivos
		fc.showOpenDialog(this);
		File file = fc.getSelectedFile(); //Recupera arquivo selecionado
		try{
			Path caminho = Paths.get(file.getAbsolutePath()); //Captura o caminho
			String retorno = new String(Files.readAllBytes(caminho)); //Joga os bytes para uma String
			texto.setText(retorno);
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(this, "Erro ao carregar arquivo");
			erro.printStackTrace();
		}
	}

}
