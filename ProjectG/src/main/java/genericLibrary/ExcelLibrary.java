package genericLibrary;



  import java.io.FileInputStream;


  import java.io.FileNotFoundException;
  import java.io.FileOutputStream;
  import java.io.IOException;

  import org.apache.poi.EncryptedDocumentException;
  import org.apache.poi.ss.usermodel.Workbook;
  import org.apache.poi.ss.usermodel.WorkbookFactory;

  public class ExcelLibrary implements FrameworkConstant {
	 

	  	static FileInputStream fis;
	  	static FileOutputStream fos;
	  	static Workbook book;

	  	public static String readsingledata(String sheet, int row, int column) {
	  		// convert external file into java understandable

	  		try {
	  			fis = new FileInputStream(excelpath);
	  		} catch (FileNotFoundException e) {
	  			e.printStackTrace();
	  		}

	  		// create an workbook using workbook factory

	  		try {
	  			book = WorkbookFactory.create(fis);
	  		} catch (EncryptedDocumentException | IOException e) {
	  			e.printStackTrace();
	  		}

	  		// read the data
	  		return book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

	  	}

	  	public static void writeNewdata(String sheet, int row, int column, String data) {

	  		// 1. Convert External File into Java Understandable

	  		try {
	  			fis = new FileInputStream(excelpath);
	  		} catch (FileNotFoundException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}

	  		// 2. Create an workbook using WorkBookFactory

	  		try {
	  			book = WorkbookFactory.create(fis);
	  		} catch (EncryptedDocumentException | IOException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}

	  		// 3. Write the New Data in new sheet, row, column
	  		book.createSheet(sheet).createRow(0).createCell(0).setCellValue(data);

	  		// 4. Convert java understandable into External file

	  		try {
	  			fos = new FileOutputStream(excelpath);
	  		} catch (FileNotFoundException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}

	  		// call the write method and pass the fos reference
	  		try {
	  			book.write(fos);
	  		} catch (IOException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}

	  		// close the browser
	  		try {
	  			book.close();
	  		} catch (IOException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	  		System.out.println("new data written successfully");
	  	}
	  }

	  


  	  


