package aula20220414;

public class AulaVariaveis {

	public static void main(String[] args) {
		int numero$um = 1;
		int numero1 = 1;
		int numeroum = 1;
		int longo = 1;
		
		int dataNascimento;
		
		String palavra = " GLEYSON ";
		palavra = palavra.trim();
		
		System.out.println(palavra);
		
		String palavra2 = " GLEYSON ".trim().replace("Y", "I");
		
		System.out.println(palavra2);
	}
	
	int somar(int numeroUm, int numeroDois) {
		return numeroUm + numeroDois;
	}
	
}
