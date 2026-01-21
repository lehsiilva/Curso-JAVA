package idiomadosistema;

import java.util.Locale;

public class Idioma{
	
	public static void main(String [] args) {
		
		Locale idioma = Locale.getDefault(); //Pegar idioma padrao do sistema
		System.out.println("O Idioma do sistema é:");
		System.out.println(idioma.toString()); 
	}
}