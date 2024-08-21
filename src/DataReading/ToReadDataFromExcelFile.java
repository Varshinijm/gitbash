package DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file=new File("./resources/data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		String data1 = workbook.getSheet("Sheet1").getRow(5).getCell(4).getStringCellValue();
		double data2 = workbook.getSheet("Sheet2").getRow(6).getCell(2).getNumericCellValue();
		LocalDateTime data3 = workbook.getSheet("Sheet3").getRow(3).getCell(3).getLocalDateTimeCellValue();
		boolean data4 = workbook.getSheet("Sheet4").getRow(8).getCell(9).getBooleanCellValue();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}
}
