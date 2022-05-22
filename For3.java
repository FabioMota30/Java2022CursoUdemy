package controle;

public class For3 {

	public static void main(String[] args) {
		
		int i = 0; //tirado de dentro do for e colocado fora
		
		for(; i < 10; i ++) {  // tirado i = 0, mas deixou o ;
			for(int j = 0; j < 10; j ++) {
				
				System.out.printf("[%d %d]", i, j);	
			}
			
			
		}
		System.out.println("\nSaiu do For...");
		System.out.println(i);
		//mostrou o valor de i fora da execução do for, fora do laço for.
	}

}
