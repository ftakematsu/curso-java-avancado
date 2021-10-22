package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoPessoa {

	public static void main(String[] args) throws IOException {
		Pessoa p1 = new Pessoa("João", "joao@mail.com", 50);
		Pessoa p2 = new Pessoa("Marcos", "marcos@mail.com", 25);
		Pessoa p3 = new Pessoa("Maria", "maria@mail.com", 40);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		File arquivo = new File("C:\\workspace\\curso-java-basico\\arquivo.txt");
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverArquivo = new FileWriter(arquivo);
		for (Pessoa p : pessoas) {
			escreverArquivo.write(p + "\n");
		}
		escreverArquivo.flush();
		escreverArquivo.close();
		
	}

}
