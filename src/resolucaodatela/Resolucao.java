package resolucaodatela;

import java.awt.Dimension; //guarda a altura e a largura 
import java.awt.Toolkit; //permite acessar recursos do sistema (no caso indormações da tela)

public class Resolucao {

    public static void main(String[] args) {

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize(); //acessa os recursos de sistema padrao e pega o tamanho da tela 

        System.out.println("Resolução da tela:");
        System.out.println(tela.width + " x " + tela.height);
    }
}
