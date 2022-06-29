package exceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataGetTest {
	
	static String projectpath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    
    public DataGetTest(String excelpath,String sheetName) {
    	try {
    	
		workbook= new XSSFWorkbook(projectpath+"/datafiles/Testdata.xlsx");
		sheet = workbook.getSheet("Sheet1");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	


	public static void main(String[] args) {
		//getRowCount();
		//getCellData(1,1);
		getCellDataNumber(0, 0);
	}
	
	public static int getRowCount() {
		int rowCount=0;
		try {
		
		rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println(rowCount);
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
	}
	
	public static int getColCount() {
		int colCount=0;
		try {
		
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println(rowCount);
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}
	
	public static String getCellDataString(int rowNum,int colNum) {
		String cellData=null;
		try {
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellData);
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
		
	}
	public static void getCellDataNumber(int rowNum,int colNum) {
		try {
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return;
	}
	
	
}