package fundamentos;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2 );
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2 );
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		
		//Tabela verdade E
		System.out.println("\nTabela verdade E(And)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		//Tabela verdade OU
		System.out.println("\nTabela verdade OU(Or)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//Tabela verdade OU Exclusivo
		System.out.println("\nTabela verdade OU Exclusivo(XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//Tabela verdade Not
		System.out.println("\nTabela verdade Not");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
