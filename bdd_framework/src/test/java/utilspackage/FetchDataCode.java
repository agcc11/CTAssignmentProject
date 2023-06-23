package utilspackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataCode {

	
	
	public static String paramethod(int i, int j) throws EncryptedDocumentException, IOException
	{
		
		String path=".//ExcelSheet/Book1.xlsx/";
		FileInputStream file=new FileInputStream(path);
		String value=new DataFormatter().formatCellValue(WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j));
		return value;	
	}
	
	
}
