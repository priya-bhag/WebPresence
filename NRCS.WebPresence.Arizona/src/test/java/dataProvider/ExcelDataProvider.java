package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	//create constructor
	public ExcelDataProvider() throws IOException{
		
		
		File src =new File("./ApplicationTestData/AppData.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
	 wb =new XSSFWorkbook(fis);
			
			
		} catch (FileNotFoundException e) {

			
			System.out.println("Exception is "+e.getMessage());
		
	}

}
	
	
	public String getdata(int sheetIndex,int row,int column){
		
		String data=wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
		return data;
		
	}

	
	

	public String getdata(String sheetName,int row,int column){
		
		String data=wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		return data;
		
	}

	
}