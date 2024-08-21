package DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromCompleteExcelSheet {//for Symmetric excel sheet

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./resources/friendInfo.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		int rowCount = workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cellCount = workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		
		String[][] arr=new String[rowCount][cellCount];
		
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				arr[i][j]=workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
		}
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
