package Seleniumprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\excel sample.xlsx";
		FileInputStream fin = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println(wb);
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(0).getCell(1));
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.createCell(2);
		cell.setCellValue("shanmugam");
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		
		
	}

}
