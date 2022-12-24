// EngineTest created by Heider and Ayo
//package com.wuerth.phoenix.cis.university.example2.test.ayo;
//
//import com.wuerth.phoenix.Cis.models.CisController;
//import com.wuerth.phoenix.bcutil.PUserException;
//import com.wuerth.phoenix.cis.ifrs16.imp.companydata.engine.IFRS16ImportCompanyDataEngine;
//import com.wuerth.phoenix.cis.test.ATransactionOperation;
//import com.wuerth.phoenix.cis.test.AbstractCISTest;
//import com.wuerth.phoenix.cis.test.AbstractULCTest;
//import com.wuerth.phoenix.cis.test.annotation.CTSFlag;
//import com.wuerth.phoenix.cis.test.annotation.CTSRun;
//import com.wuerth.phoenix.cis.test.annotation.CTSTestClassAnnotation;
//import com.wuerth.phoenix.cis.test.suite.v2manager.CISTestSuiteV2Manager.CTS2_CATEGORY;
//import com.wuerth.phoenix.cis.test.suite.v2manager.CISTestSuiteV2Manager.CTS2_MODULE;
//import com.wuerth.phoenix.cis.university.example2.test.ayo.EngineTestData;
//import com.wuerth.phoenix.cis.university.example2.test.sample.SampleEngineTestData;
//import com.wuerth.phoenix.cis.university.example2.util.FileGenerator;
//import com.wuerth.phoenix.cis.university.example2.util.Scenario;
//
//@CTSTestClassAnnotation(category=CTS2_CATEGORY.IMPORT, gui=CTSFlag.NO, module=CTS2_MODULE.IFRS16, name="IFRS16 Import Company Data Engine Test")
//public class EngineTest extends AbstractCISTest {
//
//	
//	public EngineTest(String testCaseName) {
//		super(testCaseName);
//	}
//
//	public void testSample() {
//		new SampleEngineTestData() {
//			
//			@Override
//			public boolean check(Scenario scenario) {
//				checkImport(scenario);
//				return true;
//			}
//		}.start();
//	}
//	
//
//	@CTSRun
//	public void testSampleayo() {
//		new EngineTestData() {
//			
//			@Override
//			public boolean check(Scenario scenario) {
//				checkImport(scenario);
//				return true;
//			}
//		}.start();
//	}
//	
//	
//	private void checkImport(Scenario scenario) {
//		
//		System.out.println("START...");
//		long time = System.currentTimeMillis();
//		
//		// Data generation
//		new ATransactionOperation<Boolean>(this, false) {
//
//			@Override
//			protected Boolean operation() throws PUserException {
//				DataGenerator.generate(scenario, getDbController(), false);
//				return true;
//			}
//		}.execute();
//		
//		String errorMessage = new ATransactionOperation<String>(this, false) {
//
//			@Override
//			protected String operation() throws PUserException {
//				CisController controller = getDbController();
//				IFRS16ImportCompanyDataEngine engine = new IFRS16ImportCompanyDataEngine(controller);
//				ImportChecker checker = new ImportChecker();
//
//				// Check before import
//				String errorMessage = checker.checkBeforeImport(scenario, controller);
//				if(errorMessage != null) {
//					return errorMessage;
//				}
//				
//				// File generation
//				try {
//					FileGenerator.generate(scenario);
//				}
//				catch(Exception exception) {
//					exception.printStackTrace();
//					return "An exception occurred during the import file generation!";
//				}
//
//				// Use panels
//				try {
//					Importer.usePanels(scenario, engine, controller);
//				}
//				catch(Exception exception) {
//					exception.printStackTrace();
//					return "An exception occurred during the engine use!";
//				}
//
//				// Check data parsed
//				errorMessage = checker.checkDataParsed(scenario, engine, controller);
//				if(errorMessage != null) {
//					return errorMessage;
//				}
//
//				// Check data merged
//				errorMessage = checker.checkDataMerged(scenario, engine, controller);
//				if(errorMessage != null) {
//					return errorMessage;
//				}
//
//				// Import
//				try {
//					Importer.doImport(engine);
//				}
//				catch(Exception exception) {
//					exception.printStackTrace();
//					return "An exception occurred during the import!";
//				}
//
//				// Check after import
//				errorMessage = checker.checkAfterImport(scenario, controller);
//				if(errorMessage != null) {
//					return errorMessage;
//				}
//
//				return null;
//			}
//		}.execute();
//		AbstractULCTest.assertTrue(errorMessage, errorMessage == null);
//		
//		System.out.println("...END (" + (System.currentTimeMillis() - time) + " ms)");
//	}
//}
