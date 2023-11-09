package com.CommonUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileData {

	public static String fetchData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("./TestData/productTestCase.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Products_TC");
		Row rows = sheet.getRow(row);
		Cell cells = rows.getCell(cell);
		return cells.getStringCellValue();
	}
}