package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		//sem o break o programa executa todos os abaixos caso tiver
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heidan Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heidan Shodan");
		//default:
				//System.out.println("N?o sei nada");
			
		}
	
	}

}
