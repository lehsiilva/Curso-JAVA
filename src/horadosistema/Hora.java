package horadosistema;

import java.util.Date;

public class Hora{
	
	public static void main(String [] args) {
		
		Date relogio = new Date(); // Se tem NEW eu estou referenciando um objeto
		System.out.println("A hora do sistema é:");
		System.out.println(relogio.toString()); //Converte a hora para String
	}
}