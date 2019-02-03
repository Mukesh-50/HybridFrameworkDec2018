package org.learnautomation.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		try {
			wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/ProjectData.xlsx")));
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());			
		}
	}
	
	public ExcelDataProvider(String pathOfExcel)
	{
		try {
			wb=new XSSFWorkbook(new FileInputStream(new File(pathOfExcel)));
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());			
		}
	}
	
	
	public String getStringData(String sheetName,int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	
	public int getIntegerData(String sheetName,int row,int column)
	{
		
		return (int)wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();

	}
	
	public double getdoubleData(String sheetName,int row,int column)
	{
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();

	}
	
	public String getStringData(int sheetIndex,int row,int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();

	}

}
