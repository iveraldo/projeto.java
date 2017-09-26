import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuestaoUm extends JFrame{
JLabel lado1;
JLabel lado2;
JLabel lado3;
JTextField campo1;
JTextField campo2;
JTextField campo3;
JButton botao;
JLabel resposta;

public QuestaoUm() {
	super("Exercicio 1");
	setLayout(new GridLayout(8,1));
	
	lado1 = new JLabel("Lado 1");
	lado2 = new JLabel("Lado 2");
	lado3 = new JLabel("Lado 3");
	campo1 = new JTextField("");
	campo2 = new JTextField("");
	campo3 = new JTextField("");
	botao = new JButton("Verificar Tipo");
	resposta = new JLabel("");
	
	add(lado1);
	add(campo1);
	
	add(lado2);
	add(campo2);
	
	add(lado3);
	add(campo3);
	
	add(botao);
	add(resposta);
	
	ButtonHandle botaoHandle = new ButtonHandle();
	
	botao.addActionListener(botaoHandle);
	campo1.addActionListener(botaoHandle);
	campo2.addActionListener(botaoHandle);
	campo3.addActionListener(botaoHandle);
}
public class ButtonHandle implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent evento) {
		String textoCampo1, textoCampo2, textoCampo3;
		int a,b,c;
		textoCampo1 = campo1.getText();
		textoCampo2 = campo2.getText();
		textoCampo3 = campo3.getText();
		a = Integer.parseInt(textoCampo1);
		b = Integer.parseInt(textoCampo2);
		c = Integer.parseInt(textoCampo3);
		
		if (a == b && a == c) {
			resposta.setText("Triangulo Equilatero");
		}else if (a != b && a != c) {
			resposta.setText("Triangulo Escaleno");
		}else if((a == b && a!= c) || (b ==a && b != c) || (c == a && c != b)) {
			resposta.setText("Triangulo Isósceles");
		}else {
			resposta.setText("Faltou digitar algum Numero");
		}
	}
	
}
}

