package DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromOneWholeRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./resources/friendInfo.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		int cellCount = workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		

		for(int i=0;i<cellCount;i++) {
			String data = workbook.getSheet("Sheet1").getRow(0).getCell(i).toString();
			System.out.print(data+" ");
		}
	}
}
