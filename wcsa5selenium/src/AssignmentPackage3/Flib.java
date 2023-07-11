package AssignmentPackage3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	// it is use to read the data from excel
	
	public String readExcelData(String excelpath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
	}
	public int getLastRowCount(String excelpath,String sheetName,int rowcount) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetName);
		int data = sheet.getLastRowNum();
		return data;
	}
	
	public void writeExcelData(String excelpath,String sheetName,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
	    cell.setCellValue(data);
	    
	    FileOutputStream fis1 = new FileOutputStream(excelpath);
	    wh.write(fis1);
	}
	
	public String readPropertyData(String propertyPath,String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(propertyPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
