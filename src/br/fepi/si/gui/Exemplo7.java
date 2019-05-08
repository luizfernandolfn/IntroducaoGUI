package br.fepi.si.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ComboBox com imagens
 * @author Luiz Fernando
 *
 */
public class Exemplo7 extends JFrame implements ItemListener{
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("img/foto01.png")),
			new ImageIcon(getClass().getResource("img/foto02.png")),
			new ImageIcon(getClass().getResource("img/foto03.png")),
			new ImageIcon(getClass().getResource("img/foto04.png"))
	};
	
	public Exemplo7(){
		super("Album de fotos");		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 20));
		combo.addItem("Carro 1");
		combo.addItem("Carro 2");
		combo.addItem("Carro 3");
		combo.addItem("Carro 4");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);		
		
		setSize(650, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo7();

	}

	@Override
	/**
	 * Método getStateChange() verifica a mudança de estado do componente
	 * e altera o indice do array das imagens
	 */
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

}
