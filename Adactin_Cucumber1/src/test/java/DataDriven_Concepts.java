import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Concepts {  
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\AKannan\\eclipse-workspace\\Adactin_Cucumber1\\src\\test\\java\\Credentials.xlsx");
		
		FileInputStream Fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(Fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int Rowsize = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < Rowsize; i++) {
			
			Row row = sheetAt.getRow(i);
			
			
			
		int Cellsize = row.getPhysicalNumberOfCells();
		
		
			for (int j = 0; j < Cellsize; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
					
				} else if (cellType.equals(cellType.NUMERIC)) {
					
					double d = cell.getNumericCellValue();
					
					long value = (long) d;
					
					String valueOf = String.valueOf(value);
					
					System.out.println(value);
					
					

				}
				
			}
			
		}
		
		
		
		
	}

}
