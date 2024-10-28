package demo;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Readdatafrompdftextstripper {
	@Test
	

	public void Readdatafrompdftextstripper()  throws Throwable {

		WebDriver driver = new ChromeDriver();

		File fis = new File("./src/test/resources/SQL interview questions.pdf");
		PDDocument doc = PDDocument.load(fis);
		int pages = doc.getNumberOfPages();// PRINT THE NO.OF PAGES
		System.out.println(pages);
		PDFTextStripper pdfdata = new PDFTextStripper();
         String  readDoc = pdfdata.getText(doc);
         System.out.println(readDoc);
         
         pdfdata.setStartPage(2);
         String readDoc1 = pdfdata.getText(doc);
         System.out.println(readDoc1);
         
         pdfdata.setStartPage(1);
         pdfdata.setEndPage(3);
         String readdoc = pdfdata.getText(doc);
         System.out.println(readdoc);
          

	}

}
