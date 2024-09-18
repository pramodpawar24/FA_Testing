package com.Test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Associate_Your_Patent_Pom;
import com.pageobject.Create_Portfolio;

public class Associated_Your_Patent_Test extends Baseclass {
	
	@Test
	
	public void Associated_Your_Patent_Test() throws Exception {
		
		Associate_Your_Patent_Pom login=	PageFactory.initElements(driver,Associate_Your_Patent_Pom.class );
		Library.costom_click(login.getAdvance_button(), "Adavace button");
		Library.costom_click(login.getLink(), "Hyper_Link");
		Thread.sleep(15000);
		Library.costom_click(login.getAccept(), "Advance_button");
		Library.costom_Screenshot(driver);
		Library.costom_sendkeys(login.getTxt_email(), "pramodpawar1145@gmail.com","Email_filed");
		Library.costom_sendkeys(login.getTxt_pass(), "Pramod@123", "Password");
	    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");
	    JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(2000);
		 Library.costom_click(login.getYourPatent(), "YourPatent");
		 Thread.sleep(2000);
		 Library.costom_click(login.getAsociatePatent(), "AsociatePatent");
		 Thread.sleep(2000);
		 Library.costom_click(login.getFile(), "File1");
	    
	    
	    Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\hp\\OneDrive - RESEARCHWIRE\\Upload1.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		
		JavascriptExecutor k=(JavascriptExecutor)driver;
		k.executeScript("window.scrollBy(0,450)", "");
		 Thread.sleep(2000);
		
		 Library.costom_click(login.getFile2(), "File2");
		 
		 Robot rb1 = new Robot();
			rb1.delay(2000);
			StringSelection ss1 = new StringSelection("C:\\Users\\hp\\OneDrive - RESEARCHWIRE\\Upload1.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
			rb1.keyPress(KeyEvent.VK_CONTROL);
			rb1.keyPress(KeyEvent.VK_V);
			rb1.delay(2000);
			rb1.keyRelease(KeyEvent.VK_CONTROL);
			rb1.keyRelease(KeyEvent.VK_V);
			rb1.delay(2000);
			//Enter
			rb1.keyPress(KeyEvent.VK_ENTER);
			rb1.keyPress(KeyEvent.VK_ENTER);
			rb1.delay(2000);
		 
//		StringSelection ss1 = new StringSelection("C:\\Users\\hp\\OneDrive - RESEARCHWIRE\\Book1.xlsx");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		rb.delay(2000);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
//		rb.delay(2000);
//		
//		//Enter
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.delay(2000);
		
	}

}
