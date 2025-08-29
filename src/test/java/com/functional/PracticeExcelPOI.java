package com.functional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcelPOI {
	FileInputStream fis;
	XSSFWorkbook wb;    
	public void getExcel(int rowIndex,int columnIndex) {
		
		File file = new File("./src/main/resources/Login_Test_Cases.xlsx");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sht = wb.getSheetAt(0);  
		int totalRow = sht.getPhysicalNumberOfRows();
		for(int i=0; i<totalRow; i++) {
			if(i==rowIndex) {
				Row row = sht.getRow(i);
				row.getLastCellNum();
				for  (int j=0;j<totalRow;j++) {
					if(j==columnIndex) {
						Cell cell = row.getCell(j);
						System.out.println(cell.getStringCellValue()); 
					}
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		PracticeExcelPOI obj = new PracticeExcelPOI();
		obj.getExcel(0, 1);
		obj.getExcel(1,0);
		obj.getExcel(1, 2);
	}   

}
