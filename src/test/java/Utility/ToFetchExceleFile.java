package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class ToFetchExceleFile {

	public String[][] excelFile(String Location) throws  IOException {
		File file=new File(Location);
		FileInputStream fis=new FileInputStream(file);
		Workbook wk=WorkbookFactory.create(fis);
		Sheet sh=wk.getSheet("Sheet1");
		
		int TtlRow=sh.getLastRowNum();
		int ttlColumn=sh.getRow(0).getLastCellNum();
		
		System.out.println("the total number of the row "+TtlRow);
		System.out.println("the total number of the column "+ttlColumn);
		
		String[][] data=new String[TtlRow][ttlColumn];
		DataFormatter formatter=new DataFormatter();
		
		for(int i=1;i<=TtlRow;i++) {
			
			for(int j=0;j<ttlColumn;j++) {
				data[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
				//System.out.println("the matrix value"+data);
			}
		}
		return data;
		
	}

}
