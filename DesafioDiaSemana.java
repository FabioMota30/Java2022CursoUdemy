package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o dia da Semana: ");
		
		String dia = entrada.next();
		
	
			
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}
		
		//pode usar os dois metodos no equalsIgnoreCase
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}
		
		else if("segunda".equalsIgnoreCase(dia)){
			System.out.println(2);
		}
		else if(dia.equalsIgnoreCase("terça")
				|| dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		}
		else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}
		else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}
		else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}
		else if(dia.equalsIgnoreCase("sábado")
				|| dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}
		
		entrada.close();
	}

}
