package cursojava.arquivos.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import cursojava.arquivos.Pessoa;

public class CriarPlanilhaPoi {

	public static void main(String[] args) throws IOException {
		File file = new File("arquivo_excel.xls");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
		Pessoa p1 = new Pessoa("Alex Egidio", "joao@mail.com", 50);
		Pessoa p2 = new Pessoa("Marcos Ladeu", "marcos@mail.com", 25);
		Pessoa p3 = new Pessoa("Maria Jesus", "maria@mail.com", 40);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		//System.out.println(pessoas);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas");
		
		int numeroLinha = 0;
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++); // Cria uma linha na planilha
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++);
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++);
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++);
			celIdade.setCellValue(p.getIdade());
		}
		
		FileOutputStream fileOutput = new FileOutputStream(file);
		hssfWorkbook.write(fileOutput);
		
		fileOutput.flush();
		fileOutput.close();
	
	}

}
