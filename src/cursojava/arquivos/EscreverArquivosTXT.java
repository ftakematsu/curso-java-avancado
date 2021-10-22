package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivosTXT {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\workspace\\curso-java-basico\\arquivo.txt");
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverArquivo = new FileWriter(arquivo);
		escreverArquivo.write("Meu texto no arquivo\n");
		escreverArquivo.write("Minha segunda linha\n");
		escreverArquivo.flush();
		escreverArquivo.close();
	}

}
