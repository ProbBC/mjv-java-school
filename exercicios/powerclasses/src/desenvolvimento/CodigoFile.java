package desenvolvimento;

import java.io.File; 			// é incluído porque estamos usando o pacote io. classe File 
import java.io.IOException;		// é incluído porque pode acontecer uma falha de entrada/saída, tipo uma leitura de um arquivo em disco
import java.io.BufferedReader; 	// é incluído porque estamos usando uma forma de ler o teclado, é incluído porque estamos usando o método BufferedReader 
import java.io.InputStreamReader;// é incluído porque estamos usando uma forma de ler o teclado, é incluído porque estamos usando o método InputStreamReader

public class CodigoFile {
	public static void main(String[] args) throws IOException {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		File diretorio = new File("");
		
		System.out.println("* *  *   *	       EXEMPLO DE USO DA CLASSE FILE            *   *  * *");
		System.out.println("* *  *   *	CRIAREMOS UM OU DOIS DIRETÓRIOS E UM ARQUIVO	*   *  * *");
		System.out.println("__________________________________________________________________________");
		System.out.println(" ");

		
		System.out.println("Insira o 1o diretório: ");
		String local1 = teclado.readLine();
		File diretorio1 = new File(local1);
		
		System.out.println("Insira o 2o diretório: ");
		String local2 = teclado.readLine();
		File diretorio2 = new File(local1,local2);
		
		//testando e criando diretorios

		if (!diretorio1.isDirectory() && local2.isEmpty()) {
			System.out.println("Criando diretorio1" );
			diretorio1.mkdir();
			diretorio = new File(diretorio1.getAbsolutePath());
					
		}else if (diretorio1.isDirectory() && !diretorio2.isDirectory()){
			System.out.println("Criando diretorio2");
			diretorio2.mkdir();
			diretorio = new File(diretorio2.getAbsolutePath());
			
		}else if (!diretorio1.isDirectory() && !diretorio2.isDirectory()){
			System.out.println("Criando diretorio 1 e 2.");
			diretorio2.mkdirs();
			diretorio = new File(diretorio2.getAbsolutePath());
		}else {
			diretorio = new File(diretorio2.getAbsolutePath());
		}
		
		
		// testando e criando arquivo

		System.out.println("Insira o nome do arquivo: ");
		String arquivo = teclado.readLine();
		File file = new File(diretorio,arquivo);

		
		if (file.exists()) {
			System.out.println("Arquivo já existe");
			System.out.println("É gravável: "+file.canWrite());
			System.out.println("É legível: "+file.canRead());
			System.out.println("É um diretório: "+file.isDirectory());
			System.out.println("Tamanho do arquivo em bytes: "+file.length());
			System.out.println("Nome do arquivo: " + file.getName());	
		} else {
			System.out.println("Arquivo não existe, deseja Criar (S/N):");
			String criar = teclado.readLine().toUpperCase();
			
			if (criar.equals("S")) {
				System.out.println("___________");
				file.createNewFile();
				
				System.out.println("Arquivo criado em: "+file.getAbsolutePath());
			}else {
				System.out.println("Fim");
			}
			
		}
		
		
	}
}