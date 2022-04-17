package trabalhoclasses;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** 
 * AS classes File e Path são responsáveis por operações IO de arquivos.
 * nio.Path é uma interface que representa um caminho e deve ser instanciada
 * pelo método get da classe nio.Paths.
 * nio.Files é responsável por realizar as operações de arquivos utilizando Path.
 * io.File é a classe antiga que implementa as mesmas funcionalidades.
 * 
 * O Principal motivo para o surgimento do pacote Java.nio, foi para resolver
 * os problemas do antigo pacote Java.io: Mensagens de erros confusas, 
 * suporte a metadados defeitusoso, ocasionando problemas de permissões, 
 * falta de links simbólicos e erros no metodo rename(). 
 * 
 */
public class Testes {
	public static void main(String[] args) throws IOException {
		File file = new File("teste.txt");
		
		// Para criar uma instância Path, é necessário usar o método get da classe auxiliar Paths
		Path path = Paths.get("teste.txt");
		
		System.out.println("Nome do arquivo: ");
		// Retorna o nome do arquivo
		System.out.println(file.getName());
		System.out.println(path.getFileName());
		
		System.out.println("\nCaminho absoluto do arquivo: ");
		// Retorna o caminho do arquivo
		System.out.println(path.toAbsolutePath());
		
		System.out.println("\nConversao Path para File");
		System.out.println(path.getClass());
		
		// Converte de Path para File
		File convertedPath = path.toFile();
		
		System.out.println(convertedPath.getClass());
		
		Files.createFile(path);		

	}
}
