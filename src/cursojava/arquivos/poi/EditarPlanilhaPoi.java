package cursojava.arquivos.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class EditarPlanilhaPoi {

	public static void main(String[] args) throws IOException {
		File file = new File("arquivo_excel.xls");
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			
			int numeroCelulas = linha.getPhysicalNumberOfCells();
			
			Cell cell = linha.createCell(numeroCelulas);
			cell.setCellValue("5478.00");
			
			String valorCelula = linha.getCell(0).getStringCellValue();
			linha.getCell(0).setCellValue("Sr(a). " + valorCelula);
		}
		
		
		entrada.close();
		
		FileOutputStream fileOutput = new FileOutputStream(file);
		hssfWorkbook.write(fileOutput);
		
		fileOutput.flush();
		fileOutput.close();
		hssfWorkbook.close();
		
	}

}
