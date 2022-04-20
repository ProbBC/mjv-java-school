package desenvolvimento;

import java.io.IOException;		// é incluído porque pode acontecer uma falha de entrada/saída, tipo uma leitura de um arquivo em disco
import java.io.BufferedReader; 	// é incluído porque estamos usando uma forma de ler o teclado, é incluído porque estamos usando o método BufferedReader 
import java.io.InputStreamReader;// é incluído porque estamos usando uma forma de ler o teclado, é incluído porque estamos usando o método InputStreamReader
import java.nio.file.Files;
import java.nio.file.Path;		// é incluído porque estamos usando o pacote Path
import java.nio.file.Paths;		// é incluído porque estamos usando o pacote Paths

public class CodigoPath {
	public static void main(String[] args) throws IOException {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		Path diretorio = Paths.get(".");           // File diretorio = new File("");
		
		System.out.println("* *  *   *   EXEMPLO DE USO INTERFACE PATH E DA CLASSE PATHS    *   *  * *");
		System.out.println("* *  *   *     CRIAREMOS UM OU DOIS DIRETÓRIOS E UM ARQUIVO	*   *  * *");
		System.out.println("__________________________________________________________________________");
		System.out.println(" ");

		
		System.out.println("Insira o 1o diretório: ");
		String local1 = teclado.readLine();
		Path diretorio1 = Paths.get(local1);		// File diretorio1 = new File(local1);
		
		System.out.println("Insira o 2o diretório: ");
		String local2 = teclado.readLine();
		Path diretorio2 = Paths.get(local1,local2);	// File diretorio2 = new File(local1,local2);
		
		//testando e criando diretorios

				
		if (Files.notExists(diretorio1) && local2.isEmpty()) {		//if (!diretorio1.isDirectory() && local2.isEmpty())
			System.out.println("Criando diretorio1" );
			Files.createDirectory(diretorio1);						// diretorio1.mkdir();
			diretorio = diretorio1;									// diretorio = new File(diretorio1.getAbsolutePath());
					
		}else if (!Files.notExists(diretorio1) && Files.notExists(diretorio2)){
			System.out.println("Criando diretorio2");				// }else if (diretorio1.isDirectory() && !diretorio2.isDirectory()){
			Files.createDirectories(diretorio2);					// diretorio2.mkdir();
			diretorio = diretorio2;									// diretorio = new File(diretorio2.getAbsolutePath());
			
		}else if (Files.notExists(diretorio2)){						// }else if (!diretorio1.isDirectory() && !diretorio2.isDirectory()){
			System.out.println("Criando diretorio 1 e 2.");
			Files.createDirectories(diretorio2);					// diretorio2.mkdirs();
			diretorio = diretorio2;									// diretorio = new File(diretorio2.getAbsolutePath());
		}else {
			diretorio = diretorio2;									// diretorio = new File(diretorio2.getAbsolutePath());
		}
		
		
		// testando e criando arquivo

		System.out.println("Insira o nome do arquivo: ");
		String arquivo = teclado.readLine();
		Path file = Paths.get(diretorio+"/"+arquivo);				// File file = new File(diretorio,arquivo);
		
		
		if (Files.exists(file)) {
			System.out.println("Arquivo já existe");
			System.out.println("gravado em: " +file.toString() );
			System.out.println("diretorio completo: " +diretorio.toAbsolutePath());
			
				
		} else {
			System.out.println("Arquivo não existe, deseja Criar (S/N):");
			String criar = teclado.readLine().toUpperCase();
			
			if (criar.equals("S")) {
				System.out.println("___________");
				Files.createFile(file);								// file.createNewFile();
				
				System.out.println("Arquivo criado em: "+file); 	// System.out.println("Arquivo criado em: "+file.getAbsolutePath());
			}else {
				System.out.println("Fim");
			}
			
		}
		
		
	}
}