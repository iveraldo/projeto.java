import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Questao2 extends JFrame{
	public JLabel peso;
	public JLabel planeta;
	public JTextField campoPeso;
	public JButton botaoCalcular;
	public JRadioButton mercurio;
	public JRadioButton marte;
	public JRadioButton saturno;
	public JRadioButton venus;
	public JRadioButton jupter;
	public JRadioButton urano;
	public ButtonGroup radioGroup;
	
	public Questao2() {
		super("Exercicio Questão 2");
		setLayout(new FlowLayout());
		
		peso = new JLabel("Peso na Terra");
		campoPeso = new JTextField(10);
		botaoCalcular = new JButton("Calcular Peso");
		planeta = new JLabel("Selecione o Planeta:");
		mercurio = new JRadioButton("Mercúrio", true);
		marte = new JRadioButton("Marte", false);
		saturno = new JRadioButton("Saturno", false);
		venus = new JRadioButton("Vênus");
		jupter = new JRadioButton("Júpter");
		urano = new JRadioButton("Urano");

		add(peso);
		add(campoPeso);
		add(botaoCalcular);
		add(planeta);
		add(mercurio);
		add(marte);
		add(saturno);
		add(venus);
		add(jupter);
		add(urano);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(mercurio);
		radioGroup.add(marte);
		radioGroup.add(saturno);
		radioGroup.add(venus);
		radioGroup.add(jupter);
		radioGroup.add(urano);

		BotaoHandler botaoHandler = new BotaoHandler();
		
		botaoCalcular.addActionListener(botaoHandler);
	}

	public class BotaoHandler implements ActionListener {

		
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == botaoCalcular) {

			String textoPeso, mensagem = "";
			int pesoCalculado = 0;

			textoPeso = campoPeso.getText();
			int peso = Integer.parseInt(textoPeso);
			

			
			if(mercurio.isSelected()) {	
				pesoCalculado = (int) ((peso / 10) * 0.37) * 10;
				mensagem = "O seu peso em Mercúrio é " + pesoCalculado;
				
				
			} else if (marte.isSelected()) {
				
				pesoCalculado = (int) ((peso / 10) * 0.38) * 10;
				mensagem = "O seu peso em Marte é " + pesoCalculado;
				
			} else if(saturno.isSelected()) {
				
				pesoCalculado = (int) ((peso / 10) * 1.15) * 10;
				mensagem = "O seu peso em Saturno é " + pesoCalculado;
				
			} else if(venus.isSelected()) {
				
				pesoCalculado = (int) ((peso / 10) * 0.88) * 10;
				mensagem = "O seu peso em Mercúrio é " + pesoCalculado;
				
			} else if(jupter.isSelected()) {

				pesoCalculado = (int) ((peso / 10) * 2.64) * 10;
				mensagem = "O seu peso em Jupter é " + pesoCalculado;
				
			} else if(urano.isSelected()) {
				
				pesoCalculado = (int) ((peso / 10) * 1.17) * 10;
				mensagem = "O seu peso em Urano é " + pesoCalculado;
				
			}
			
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}

	}


}
