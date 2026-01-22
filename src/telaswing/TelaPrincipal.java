package telaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class TelaPrincipal extends JFrame { //extends: herança 

	public TelaPrincipal() {
	    
		//Ttitulo ja Janela
		setTitle("MinhaJanela");
		
		//Tamanho da Janela 
		setSize(400,200);
		
		//Fecha o programa ao clicar no X 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Centraliza a Janela
		setLocationRelativeTo(null);
		
		//Painel para organizar os componentes
		JPanel painel = new JPanel();
		
		//2 linhas 1 coluna (Formatação)
		painel.setLayout(new GridLayout(2,1));
		
		//Texto (Label)
		JLabel texto = new JLabel("Para um 2026 de Sorte", JLabel.CENTER);
		
		//Botão
		JButton botao = new JButton("Clique Aqui!");
		
		botao.addActionListener(e -> {
			JPanel painelMensagem = new JPanel();
			painelMensagem.setLayout(new GridLayout(2,1));
			JLabel textoMensagem = new JLabel("Chuvinha de Coisas Boas", JLabel.CENTER);
			
			ImageIcon iconOriginal = new ImageIcon(getClass().getResource("gatinho.jpg"));
			Image imagemRedimensionada = iconOriginal.getImage().getScaledInstance(
			        150,  // largura
			        150,  // altura
			        java.awt.Image.SCALE_SMOOTH // SCALE SMOOTH deixa a imagem bonita sem pixelar
			    );

			    ImageIcon iconFinal = new ImageIcon(imagemRedimensionada);

			    JLabel imagemLabel = new JLabel(iconFinal, JLabel.CENTER);
			
			painelMensagem.add(textoMensagem);
			painelMensagem.add(imagemLabel);
			
			
			JOptionPane.showMessageDialog(null, painelMensagem, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		});
		
		//Adicionando o texto e o botão ao painel
		painel.add(texto);
		painel.add(botao);
		
		//Adicionando o painel á Janela
		add(painel);
		
		//Tornar a Janela Visivel
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new TelaPrincipal();

	}

}
