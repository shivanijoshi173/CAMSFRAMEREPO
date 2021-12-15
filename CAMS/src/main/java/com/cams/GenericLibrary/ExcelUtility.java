package com.cams.GenericLibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	/**
	 * this method will read data from excel sheet
	 * @throws Throwable 
	 */
  public String getExcelData(String sheetname,int rownum,int cellnum) throws Throwable {
	  FileInputStream fis= new FileInputStream(IPathConstants.ExcelPath);
	  Workbook book= WorkbookFactory.create(fis);
	  Sheet sh=book.getSheet(sheetname);
	  Row row=sh.getRow(rownum);
	  Cell cell=row.getCell(cellnum);
	  String value=cell.getStringCellValue();
	  return value;
	  
 }
  /**
   * this method return data full in sheet
   * @param sheetname
   * @throws Throwable
   */
  public Object[][] getExceldata(String sheetname) throws Throwable  
  {
	  FileInputStream fis= new FileInputStream(IPathConstants.ExcelPath);
	  Workbook book=WorkbookFactory.create(fis);
	  Sheet sh=book.getSheet(sheetname);
	  int lastrow=sh.getLastRowNum();
	  int lastcell=sh.getRow(0).getLastCellNum();
	  Object[][] data=new Object[lastrow][lastcell];
	  for(int i=0;i< lastrow;i++) 
	  {
		  
		  for(int j=0;j<lastcell;j++) 
		  {
			  
			data[i][j]= sh.getRow(i+1).getCell(j).getStringCellValue();
		  }
		  
	  }
	  
	  return data;
  }
  
  public String  getexceldatainstring(String sheetname,int rownum,int cellnum) throws Throwable
  {
	  FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
	  Workbook book=WorkbookFactory.create(fis);
	 
	Sheet sh=book.getSheet(sheetname);
	DataFormatter d=new DataFormatter();
	return d.formatCellValue(sh.getRow(rownum).getCell(cellnum));
	
  }

}
