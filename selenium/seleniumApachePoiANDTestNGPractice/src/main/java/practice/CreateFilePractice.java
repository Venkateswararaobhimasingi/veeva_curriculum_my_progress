package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateFilePractice {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\textfiles\\Datacreated.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sheet=wb.createSheet("Data");
		
		XSSFRow r1=sheet.createRow(0);
			r1.createCell(0).setCellValue("BookName ");
			r1.createCell(1).setCellValue("Purchased Date");
			r1.createCell(2).setCellValue("Amount");
			
		XSSFRow r2=sheet.createRow(1);
			r2.createCell(0).setCellValue("java");
			r2.createCell(1).setCellValue("22-12-2025");
			r2.createCell(2).setCellValue(500);
		
		XSSFRow r3=sheet.createRow(2);
			r3.createCell(0).setCellValue("python");
			r3.createCell(1).setCellValue("22-12-2025");
			r3.createCell(2).setCellValue(500);
			
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("created");

	}

}
