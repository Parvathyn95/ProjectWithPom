/*package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	XSSFSheet sheet;
	private int i;
	private int j;
	public ExcelUtility(int i, int j) {
		this.i=i;
		this.j=j;
		
	}
	public ExcelUtility() throws IOException {
		File path = new File(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\color.xlsx");
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet("Sheet1");
	}
	public String ReadStringDataExcel(int i, int j) {    
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		return cell.getStringCellValue();                 
	}

}*/

package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
public static XSSFWorkbook wb;
public static XSSFSheet sh;
public static FileInputStream f;
	

public static String getStringMultiColor(int i, int j, String file_path, String sheet) throws IOException {
f = new FileInputStream(System.getProperty("user.dir") + file_path);
wb = new XSSFWorkbook(f);
sh = wb.getSheet(sheet);
Row r = sh.getRow(i);
Cell c = r.getCell(j);
return c.getStringCellValue();

}




}