package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivosTXT {

	public static void main(String[] args) {
		try {
			
			File arquivo = new File("C:\\workspace\\curso-java-basico\\arquivo.txt");
		
			FileInputStream entradaArquivo = 
				new FileInputStream(arquivo);
			
			Scanner leitorArquivo = new Scanner(entradaArquivo, "UTF-8");
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			while (leitorArquivo.hasNext()) {
				String linha = leitorArquivo.nextLine();
				if (!linha.isEmpty() && linha!=null) {
					String[] dados = linha.split(";");
					Pessoa pessoa = new Pessoa(dados[0].trim(), dados[1].trim(), Integer.parseInt(dados[2].trim()));
					System.out.println(pessoa);
					pessoas.add(pessoa);
				}
			}
			
			System.out.println("Número de pessoas: " + pessoas.size());
			System.out.println(pessoas);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
