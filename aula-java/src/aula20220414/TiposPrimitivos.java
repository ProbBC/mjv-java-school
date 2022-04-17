package aula20220414;

public class TiposPrimitivos {	
	// variaveis de classses numericas recebe valor padrao zero
	static int numero;	
	static boolean simNao;
	static char cchar;
	
	public static void main(String[] args) {
		//pq variavel local de metodo precisa ser inicializada?
		byte vbyte = 127;
		int vint = 1;
		
		double vdouble = 12.5;
		char vchar = 'C';
		boolean vboolean = true;
		
		System.out.println(numero);
		System.out.println(simNao);
		System.out.println(cchar);
		
		long numeroLongo = 55867564165L;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
	}
}
