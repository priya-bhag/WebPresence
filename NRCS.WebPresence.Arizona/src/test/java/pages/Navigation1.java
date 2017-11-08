package pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class Navigation1 {

	static WebDriver driver;
	
	public Navigation1(WebDriver Idriver){
		
		this.driver=Idriver;
	}
	
	//Prod Elements
	
	@FindBy(xpath=".//*[@id='nav']/li[2]/a")
	public static WebElement TopicsLinkProd;
	
	
	
	
	@FindBy(xpath=".//*[@id='nav']/li[4]/a")
	static WebElement ProgramsLinkProd;
	
	

	
	@FindBy(xpath=".//*[@id='nav']/li[6]/a")
	static WebElement NewsRoomLinkProd;
	

	
	@FindBy(xpath=".//*[@id='nav']/li[8]/a")
	static WebElement ContactUsProd;
	
	@FindBy(xpath="	.//*[@id='top_nav']/ul/li[1]/a") 
	static WebElement aboutUSProd;




	@FindBy(xpath=".//*[@id='topics']/li[1]/a/span")
	static WebElement TechnicalResourcesProd;
	
	
	
	

	@FindBy(xpath=".//*[@id='firstElement']/a[2]")
	static WebElement ConservationPlanningProd;
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/a[2]")
	static WebElement 	ConservationTechnicalAssistanceProd ;
	
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[1]/ul/li[2]/a[2]")
	static WebElement 		TechnicalServiceProvidersProd ;
	
	
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[2]/a[2]")
	static WebElement 	DataMapsAnalysisProd  ;
	
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[2]/ul/li[1]/a[2]")
	static WebElement 	 EconomicsProd   ;
	
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[2]/a[2]")
	static WebElement 	 GISProd  ;
	
	
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[3]/a[2]")
	static WebElement 	 NationalResourcesInventoryProd   ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[4]/a[2]")
	static WebElement 	 RapidWatershedAssessmentProd   ;
	
	
	
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/a[2]")
	static WebElement 	 	EcologicalScienceProd  ;
	
	
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[1]/a[2]")
	static WebElement 	 	 AgronomyProd   ;
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[2]/a[2]")
	static WebElement 	 	 BiologyProd   ;
	
	
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[4]/a[2]")
	static WebElement 	 	 InvasiveSpeciesProd  ;
	
	

	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[5]/a[2]")
	static WebElement 	 		ManureManagementProd  ;
	
	
	
	
	
	

	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[6]/a[2]")
	static WebElement 	 		NutrientManagementProd  ;
	
	
	
	
	
	
	

	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[7]/a[2]")
	static WebElement 	 		PestManagementProd  ;
	
	
	
	
	

	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[8]/a[2]")
	static WebElement 	ThreatenedEndangeredSpeciesProd ;
	
	


	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[4]/a[2]")
	static WebElement 		EngineeringProd ;
	
	
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/a[2]")
	static WebElement 		LandUseProd ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/ul/li[1]/a[2]")
	static WebElement 	 CroplandProd  ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/ul/li[2]/a[2]")
	static WebElement 	 RangePastureProd  ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/ul/li[3]/a[2]")
	static WebElement 	ForestryProd ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/a[2]")
	static WebElement 	StateTechnicalCommitteeProd;
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/ul/li[1]/a[2]")
	static WebElement  STCMinutesProd  ;
	
	
	
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/ul/li[2]/a[2]")
	static WebElement STCAgendaProd  ;
	
	
	
	
	
	
	@FindBy(xpath=".//*[@id='nav']/li[4]/a")
	static WebElement ProgramsProd;
	
	
	
	

	
	
	@FindBy(xpath=".//*[@id='firstElement']/a[2]")
	static WebElement FarmBillProd;
	

	
	@FindBy(xpath=".//*[@id='firstElement']/ul/li[1]/a[2]")
	static WebElement 	ConservationComplianceProd;
	
	

	@FindBy(xpath=".//*[@id='firstElement']/ul/li[2]/a[2]")
	static WebElement 		RegionalConservationPartnershipProgramProd;
	
	
	
	
	

	@FindBy(xpath=".//*[@id='firstElement']/ul/li[2]/a[2]")
	static WebElement 		FinancialAssistanceProd;
	
	
	
	

	

	@FindBy(xpath=".//*[@id='firstElement']/a[2]")
	static WebElement 		ConservationInnovationGrantsProd;
	
	
	
	
	@FindBy(xpath=".//*[@id='firstElement']/ul/li/a[2]")
	static WebElement 		CIGProjectSearchProd;
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/a[2]")
	static WebElement 		ConservationStewardshipProgramProd;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/a[2]")
	static WebElement 		 EnvironmentalQualityIncentivesProgramProd;
	
	
	
	
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[4]/a[2]")
	static WebElement 		 EmergencyWatershedProtectionProgramProd;
	
	
	
	


	@FindBy(xpath=".//*[@id='tree']/li/ul/li[3]/a[2]")
	static WebElement 		 EasementsProd;
	



	@FindBy(xpath=".//*[@id='tree']/li/ul/li[3]/ul/li[1]/a[2]")
	static WebElement 		AgriculturalConservationEasementProgramProd;
	
	
	




	@FindBy(xpath=".//*[@id='tree']/li/ul/li[3]/ul/li[2]/a[2]")
	static WebElement 			HealthyForestsReserveProgramProd;
	
	

	




	@FindBy(xpath=".//*[@id='tree']/li/ul/li[4]/a[2]")
	static WebElement 				LandscapeInitiativesProd;
	
	
	


	




	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/a[2]")
	static WebElement 					LandscapePlanningProd;
	
	
	
	




	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[1]/a[2]")
	static WebElement 					EmergencyWatershedProtectionProgramProd_Program;
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[2]/a[2]")
	static WebElement 			WatershedProtectionandFloodPreventionProgramProd;
	
	
	
	
	

	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[3]/a[2]")
	static WebElement 				WatershedSurveysandPlanningProd;
	
	
	
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[4]/a[2]")
	static WebElement 				WatershedOperationsProd;
	
	
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[5]/a[2]")
	static WebElement 				WatershedRehabilitationProd;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//+ 


	@FindBy(xpath=".//*[@id='level1_hitarea_101000000000000']") static WebElement button1Prod;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_102000000000000']") static WebElement button2Prod;
	


	@FindBy(xpath=".//*[@id='level1_hitarea_121000000000000']") static WebElement button3Prod;
	


	@FindBy(xpath=".//*[@id='level1_hitarea_651000000000000']") static WebElement button4Prod;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_122000000000000']") static WebElement button5Prod;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_123000000000000']") static WebElement button6Prod;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_124000000000000']") static WebElement button7Prod;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_103000000000000']") static WebElement button8Prod;
	
	

	
	
	
	

	@FindBy(xpath=".//*[@id='firstElement']/div") static WebElement button9Prod;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/div") static WebElement button10Prod;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/div") static WebElement button11Prod;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/div") static WebElement button12Prod;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/div") static WebElement button13Prod;
	
	
	
	
	
	

	@FindBy(xpath=".//*[@id='firstElement']/div") static WebElement button14Prod;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/div") static WebElement button15Prod;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[1]/div") static WebElement button16Prod;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/div") static WebElement button17Prod;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/div") static WebElement button18Prod;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Elements in Test
	
	
	@FindBy(xpath=".//*[@id='nav']/li[2]/a")
	public static WebElement TopicsLinkTest;
	
	
	
	
	@FindBy(xpath=".//*[@id='nav']/li[4]/a")
	static WebElement ProgramsLinkTest;
	
	

	
	@FindBy(xpath=".//*[@id='nav']/li[6]/a")
	static WebElement NewsRoomLinkTest;
	

	
	@FindBy(xpath=".//*[@id='nav']/li[8]/a")
	static WebElement ContactUsTest;
	

	@FindBy(xpath="	.//*[@id='top_nav']/ul/li[1]/a")
	static WebElement aboutUSTest;
	



	@FindBy(xpath=".//*[@id='topics']/li[1]/a/span")
	static WebElement TechnicalResourcesTest;
	
	
	
	

	@FindBy(xpath=".//*[@id='firstElement']/a[2]")
	static WebElement ConservationPlanningTest;
	
	

	@FindBy(xpath=".//*[@id='firstElement']/ul/li[1]/a[2]")
	static WebElement 	ConservationTechnicalAssistanceTest ;
	
	
	

	@FindBy(xpath=".//*[@id='firstElement']/ul/li[2]/a[2]")
	static WebElement 		TechnicalServiceProvidersTest ;
	
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/a[2]")
	static WebElement 	DataMapsAnalysisTest  ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[1]/a[2]")
	static WebElement 	 EconomicsTest   ;
	
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[2]/a[2]")
	static WebElement 	 GISTest  ;
	
	
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[3]/a[2]")
	static WebElement 	 NationalResourcesInventoryTest   ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[4]/a[2]")
	static WebElement 	 RapidWatershedAssessmentTest   ;
	
	
	
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/a[2]")
	static WebElement 	 	EcologicalScienceTest  ;
	
	
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[1]/a[2]")
	static WebElement 	 	 AgronomyTest   ;
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[2]/a[2]")
	static WebElement 	 	 BiologyTest   ;
	
	
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[4]/a[2]")
	static WebElement 	 	 InvasiveSpeciesTest  ;
	
	

	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[5]/a[2]")
	static WebElement 	 		ManureManagementTest  ;
	
	
	
	
	
	

	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[6]/a[2]")
	static WebElement 	 		NutrientManagementTest  ;
	
	
	
	
	
	
	

	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[7]/a[2]")
	static WebElement 	 		PestManagementTest  ;
	
	
	
	
	

	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/ul/li[8]/a[2]")
	static WebElement 	ThreatenedEndangeredSpeciesTest ;
	
	


	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[4]/a[2]")
	static WebElement 		EngineeringTest ;
	
	
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/a[2]")
	static WebElement 		LandUseTest ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/ul/li[1]/a[2]")
	static WebElement 	 CroplandTest  ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/ul/li[2]/a[2]")
	static WebElement 	 RangePastureTest  ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/ul/li[3]/a[2]")
	static WebElement 	ForestryTest ;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/a[2]")
	static WebElement 	StateTechnicalCommitteeTest;
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/ul/li[1]/a[2]")
	static WebElement  STCMinutesTest  ;
	
	
	
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/ul/li[2]/a[2]")
	static WebElement STCAgendaTest  ;
	
	

	
	
	@FindBy(xpath=".//*[@id='nav']/li[4]/a")
	static WebElement ProgramsTest;
	
	
	
	

	
	
	@FindBy(xpath=".//*[@id='firstElement']/a[2]")
	static WebElement FarmBillTest;
	

	
	@FindBy(xpath=".//*[@id='firstElement']/ul/li[1]/a[2]")
	static WebElement 	ConservationComplianceTest;
	
	

	@FindBy(xpath=".//*[@id='firstElement']/ul/li[2]/a[2]")
	static WebElement 		RegionalConservationPartnershipProgramTest;
	
	
	
	
	

	@FindBy(xpath=".//*[@id='firstElement']/ul/li[2]/a[2]")
	static WebElement 		FinancialAssistanceTest;
	
	
	
	

	

	@FindBy(xpath=".//*[@id='firstElement']/a[2]")
	static WebElement 		ConservationInnovationGrantsTest;
	
	
	
	
	@FindBy(xpath=".//*[@id='firstElement']/ul/li/a[2]")
	static WebElement 		CIGProjectSearchTest;
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/a[2]")
	static WebElement 		ConservationStewardshipProgramTest;
	
	
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/a[2]")
	static WebElement 		 EnvironmentalQualityIncentivesProgramTest;
	
	
	
	
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[4]/a[2]")
	static WebElement 		 EmergencyWatershedProtectionProgramTest;
	
	
	
	


	@FindBy(xpath=".//*[@id='tree']/li/ul/li[3]/a[2]")
	static WebElement 		 EasementsTest;
	



	@FindBy(xpath=".//*[@id='tree']/li/ul/li[3]/ul/li[1]/a[2]")
	static WebElement 		AgriculturalConservationEasementProgramTest;
	
	
	




	@FindBy(xpath=".//*[@id='tree']/li/ul/li[3]/ul/li[2]/a[2]")
	static WebElement 			HealthyForestsReserveProgramTest;
	
	

	




	@FindBy(xpath=".//*[@id='tree']/li/ul/li[4]/a[2]")
	static WebElement 				LandscapeInitiativesTest;
	
	
	


	




	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/a[2]")
	static WebElement 					LandscapePlanningTest;
	
	
	
	




	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[1]/a[2]")
	static WebElement 					EmergencyWatershedProtectionProgramTest_Program;
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[2]/a[2]")
	static WebElement 			WatershedProtectionandFloodPreventionProgramTest;
	
	
	
	
	

	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[3]/a[2]")
	static WebElement 				WatershedSurveysandPlanningTest;
	
	
	
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[4]/a[2]")
	static WebElement 				WatershedOperationsTest;
	
	
	
	

	@FindBy(xpath=".//*[@id='tree']/li/ul/li[5]/ul/li[5]/a[2]")
	static WebElement 				WatershedRehabilitationTest;
	
	
	
	
	



	@FindBy(xpath=".//*[@id='level1_hitarea_101000000000000']") static WebElement button1Test;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_102000000000000']") static WebElement button2Test;
	


	@FindBy(xpath=".//*[@id='level1_hitarea_121000000000000']") static WebElement button3Test;
	


	@FindBy(xpath=".//*[@id='level1_hitarea_651000000000000']") static WebElement button4Test;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_122000000000000']") static WebElement button5Test;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_123000000000000']") static WebElement button6Test;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_124000000000000']") static WebElement button7Test;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_103000000000000']") static WebElement button8Test;
	
	

	
	@FindBy(xpath=".//*[@id='firstElement']/div") static WebElement button9Test;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/div") static WebElement button10Test;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/div") static WebElement button11Test;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/div") static WebElement button12Test;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/div") static WebElement button13Test;
	
	
	
	
	


	@FindBy(xpath=".//*[@id='firstElement']/div") static WebElement button14Test;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/div") static WebElement button15Test;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/ul/li[1]/div") static WebElement button16Test;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/div") static WebElement button17Test;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/div") static WebElement button18Test;
	
	
	
	
	
	
	
	
	
	
	

	
	//@FindBy(xpath="	.//*[@id='top_nav']/ul/li[1]/a") static WebElement aboutUSTest;


	@FindBy(xpath="")
	static List<WebElement> TopicsTable_MainMenuTest;

	@FindBy(xpath="")
	static List<WebElement> TopicsTable_SubMenuTest;
	
	@FindBy(xpath="")
	static List<WebElement> ProgramsTableTest;

	@FindBy(xpath="")
	static List<WebElement> NewsRoomTableTest;

	@FindBy(xpath="")
	static List<WebElement> ContactUsTableTest;


	//Arrays
	
	
		public static List<String> Topics_MenuArrayProd  =null;
		
		public static List<String> Topics_MenuArrayTest  =null;

		
		public static List<String> TopicsArrayProd  =null;
		
		public static List<String> TopicsArrayTest  =null;

		public static List<String> ProgramsArrayProd  =null;
		
		public static List<String> ProgramsArrayTest =null;

		
		public static List<String> NewsRoomArrayProd  =null;
		
		public static List<String> NewsRoomArrayTest  =null;

		public static List<String> ContactUsArrayProd  =null;
		
		public static List<String> ContactUsArrayTest  =null;

		
	
	
	

public static void mouseOver_TopicsLink(WebElement element){
	
	Actions builder=new Actions(driver);

	builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
}



public static void mouseOver_ProgramsLink(WebElement element){
		
	Actions builder=new Actions(driver);


	builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);	
		
	}

	
public static void mouseOver_NewsRoomLink(WebElement element){
	
	Actions builder=new Actions(driver);

    builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(370,TimeUnit.SECONDS);	
		
	
}


public static void mouseOver_ContactUs(WebElement element){
	
	
	Actions builder=new Actions(driver);

	   builder.moveToElement(element).build().perform();
		
		driver.manage().timeouts().implicitlyWait(370,TimeUnit.SECONDS);	
	
}

	
	public static void validateURL() throws InterruptedException{
		
		mouseOver_TopicsLink(TopicsLinkProd);
		
		Thread.sleep(10);

		button1Prod.click();
		button2Prod.click();
		button3Prod.click();
		button4Prod.click();
		button5Prod.click();
		button6Prod.click();
		button7Prod.click();
		button8Prod.click();
		
		
	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
	


	
	
	mouseOver_ProgramsLink(ProgramsLinkProd);
	

	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);

	
	mouseOver_NewsRoomLink(NewsRoomLinkProd);
	
	
	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);


	mouseOver_ContactUs(ContactUsProd);
	
	
	mouseOver_TopicsLink(TopicsLinkProd);

	
	TechnicalResourcesProd.click();
	
	
	button9Prod.click();
	button10Prod.click();
	button11Prod.click();
	button12Prod.click();
	button13Prod.click();

	/*try{
	
	if(driver.findElement(By.xpath(".//*[@id='acsMainInvite']/div")).isDisplayed()){
		
		driver.findElement(By.xpath(".//*[@id='acsMainInvite']/a ")).click();
	}
			
	}
	
	catch(Exception e){
		System.out.println(e.toString());
	}
	*/
	ConservationPlanningProd.click();
	
	
	
	ConservationTechnicalAssistanceProd.click();
	
	Thread.sleep(1000);
	
	TechnicalServiceProvidersProd.click();
	
driver.findElement(By.xpath(".//*[@id='tree']/li/ul/li[2]/div")).click();

		DataMapsAnalysisProd.click(); 
	
	
		 EconomicsProd.click();
	

 GISProd.click();
	
	
	 NationalResourcesInventoryProd.click(); 
	
	
 RapidWatershedAssessmentProd.click();
 
 driver.findElement(By.xpath(".//*[@id='tree']/li/ul/li[3]/div")).click();
	
		EcologicalScienceProd.click(); 
	 AgronomyProd.click();
 BiologyProd.click(); 
	
	
	 InvasiveSpeciesProd.click(); 
	
	
ManureManagementProd.click(); 
	
	NutrientManagementProd.click(); 
	
	
	PestManagementProd.click();
	
	ThreatenedEndangeredSpeciesProd.click(); 
	
	
EngineeringProd.click(); 
	
LandUseProd.click();
	
	 CroplandProd.click(); 
	
	
 RangePastureProd.click(); 
	
	ForestryProd.click();
	
	
	StateTechnicalCommitteeProd.click();
	
	STCMinutesProd.click();
	
	
	STCAgendaProd.click();
	

	
	
	mouseOver_ProgramsLink(ProgramsLinkProd);
	
	

	ProgramsProd.click();
	
	
	
	button14Prod.click();

	
	button15Prod.click();

	button16Prod.click();

	
	button17Prod.click();

	
	button18Prod.click();

	

 FarmBillProd.click();
	
ConservationComplianceProd.click();
	
	
RegionalConservationPartnershipProgramProd.click();
	
	FinancialAssistanceProd.click();
	
	
		ConservationInnovationGrantsProd.click();
	
	
		CIGProjectSearchProd.click();
	
ConservationStewardshipProgramProd.click();
	
	 EnvironmentalQualityIncentivesProgramProd.click();
	
		 EmergencyWatershedProtectionProgramProd.click();
	
		 EasementsProd.click();
	
	AgriculturalConservationEasementProgramProd.click();
	
		HealthyForestsReserveProgramProd.click();
	
			LandscapeInitiativesProd.click();
	
	
			LandscapePlanningProd.click();
	
	
				EmergencyWatershedProtectionProgramProd_Program.click();
	
		WatershedProtectionandFloodPreventionProgramProd.click();
	
	
	WatershedSurveysandPlanningProd.click();
	
	WatershedOperationsProd.click();
	

	WatershedRehabilitationProd.click();
	
	
	
	/*
	

		aboutUSProd.click();
		
		
		
driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"home/");

mouseOver_TopicsLink(TopicsLinkTest);
	
	

	button1Test.click();
	button2Test.click();
	button3Test.click();
	button4Test.click();
	button5Test.click();
	button6Test.click();
	button7Test.click();
	button8Test.click();
	

	
	mouseOver_ProgramsLink(ProgramsLinkTest);
	
	
	
	mouseOver_NewsRoomLink(NewsRoomLinkTest);
	
	
	mouseOver_ContactUs(ContactUsTest);
	
	
	aboutUSTest.click();*/



	}
}
