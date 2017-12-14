package com.project.maven.scientificCalculator;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

/**
 * Here I will put all my tests for the advanced calculations. 
 * 
 * I will use a loop, 50 times each, for positive and negative numbers and zero.
 * 
 * @author erica
 * @version 1.0
 */

public class AdvancedCalculatorTest {
	
	private static final Logger LOG = Logger.getLogger(Main.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	AdvancedCalculator ac = new AdvancedCalculator();
	
	double firstNo = 0.0;
	double secondNo = 0.0;
	double result = 0.0;

	/**
	 * Here I handle test for the pi method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testPiPositive() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.PI * firstNo;
			
			LOG.info("Testing pi positive with value: " +firstNo +" result: " +result);
			assertEquals(ac.pi(firstNo), result, 0.1);
		
	}
}
	
	@Test
	public void testPiNegative() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(-random.nextDouble()*100));
			result = Math.PI * firstNo;
			
			
			LOG.info("Testing pi negative with the value" +firstNo +" result:"  +result);
			assertEquals(ac.pi(firstNo), result, 0.1);
		
	}
}
	
	@Test
	public void testPiZero() {
			
			firstNo = 0.0;
			result = Math.PI * firstNo;
			
			
			LOG.info("Testing pi zero with value: " +firstNo +" result: " +result);
			assertEquals(ac.pi(firstNo), result, 0.1);
		
	}
	
	/**
	 * Here I handle test for the sin method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testSinPositive() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.sin(firstNo);
			
			
			LOG.info("Testing sin positive with value: " +firstNo +" result: " +result);
			assertEquals (ac.sin(firstNo), result, 0.1); 
	}
		
	}
	
	@Test
	public void testSinNegative() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(-random.nextDouble()*5));
			result = Math.sin(firstNo);
			
			LOG.info("Testing sin negative with value: " +firstNo +" result: " +result);
			assertEquals (ac.sin(firstNo), result, 0.1); 
	}
		
	}
	
	@Test
	public void testSinZero() {
			
			firstNo = 0.0;
			result = Math.sin(firstNo);
			
			
			LOG.info("Testing sin zero with value: " +firstNo +" result: " +result);
			assertEquals (ac.sin(firstNo), result, 0.1); 
	}
		
	
	/**
	 * Here I handle test for the sinh method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testSinHPositive() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.sinh(firstNo);
			
			LOG.info("Testing sinh positive with value: " +firstNo +" result: " +result);
			assertEquals(ac.sinh(firstNo), result, 0.1); 
	}
	}
	@Test
	public void testSinhNegative() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(-random.nextDouble()*5));
			result = Math.sinh(firstNo);
			
			LOG.info("Testing sinh negative with value: " +firstNo +" result: " +result);
			assertEquals (ac.sinh(firstNo), result, 0.1); 
	}
	}
	
	@Test
	public void testSinhZero() {
			
			firstNo = 0.0;
			result = Math.sinh(firstNo);
			
			
			LOG.info("Testing sin h zero with value: " +firstNo +" result: " +result);
			assertEquals (ac.sinh(firstNo), result, 0.1); 
	}
	
	/**
	 * Here I handle test for the log method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testLogPositive() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.log(firstNo);
			
			LOG.info("Testing log positive with value: " +firstNo +" result: " +result);
			assertEquals(ac.log(firstNo), result, 0.1); 
	}
	}
	@Test
	public void testLogNegative() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(-random.nextDouble()*5));
			result = Math.log(firstNo);
			
			LOG.info("Testing log negative with value: " +firstNo +" result: " +result);
			assertEquals (ac.log(firstNo), result, 0.1); 
	}
	}
	
	
	/**
	 * Here I handle test for the square root method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testSquareRootPositive() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.sqrt(firstNo);
			
			LOG.info("Testing square root positive with value: " +firstNo +" result: " +result);
			assertEquals(ac.squareRoot(firstNo), result, 0.1); 
	}
	}
	@Test
	public void testSquareRootNegative() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(-random.nextDouble()*5));
			result = Math.sqrt(firstNo);
			
			LOG.info("Testing square root negative with value: " +firstNo +" result: " +result);
			assertEquals (ac.squareRoot(firstNo), result, 0.1); 
	}
	}
	
	@Test
	public void testSquareRootZero() {
			
			firstNo = 0.0;
			result = Math.sqrt(firstNo);
			
			LOG.info("Testing square root zero with value: " +firstNo +" result: " +result);
			assertEquals (ac.squareRoot(firstNo), result, 0.1); 
	}
	
	/**
	 * Here I handle test for the plusminus method.
	 * First with positive numbers, then negative and lastly zero.
	 * 
	 * It converts positive numbers into negative numbers.
	 */
	@Test
	public void testPlusMinusositive() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = (firstNo * (-1));
			
			LOG.info("Testing plusminus positive with value: " +firstNo +" result: " +result);
			assertEquals(ac.plusMinus(firstNo), result, 0.1); 
	}
	}
	@Test
	public void testPlusMinusNegative() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(-random.nextDouble()*5));
			result = (firstNo * (-1));
			
			LOG.info("Testing square root negative with value: " +firstNo +" result: " +result);
			assertEquals (ac.plusMinus(firstNo), result, 0.1); 
	}
	}
	
	@Test
	public void testPlusMinusZero() {
			
			firstNo = 0.0;
			result = (firstNo * (-1));
			
			LOG.info("Testing plusminus zero with value: " +firstNo +" result: " +result);
			assertEquals (ac.plusMinus(firstNo), result, 0.1); 
	}
	
}
