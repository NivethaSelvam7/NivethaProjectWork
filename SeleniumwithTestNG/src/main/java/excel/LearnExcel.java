package excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public Object[][] readExcel()throws IOException {
		XSSFWorkbook WBook= new XSSFWorkbook("./TestData/TestData.xlsx");
		XSSFSheet sheet = WBook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(colCount);
		Object[][] data = new Object[rowcount][colCount];
		for (int i = 1; i <=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <colCount; j++) {
				data[i-1][j]= row.getCell(j).getStringCellValue();
			}
		}
		return data;
	}

}
