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


	@Test
	public void testPiPositive() {
		
		double randomValue = 0.0;
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			// Måste ju görs en beräkning i varje loop. firstNo.byteValue
			
			LOG.info("Testing add positive with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (ac.add(firstNo, secondNo)), Math.round(result), 0.1); //skriver jag cdr. så kommer valid förslag fram
		
	}
}
	@Test
	public void testSin() {
		
		double randomValue = 0.0;
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			// Måste ju görs en beräkning i varje loop. firstNo.byteValue
			
			LOG.info("Testing add positive with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (ac.sin(firstNo, secondNo)), Math.round(result), 0.1); //skriver jag cdr. så kommer valid förslag fram
	}
		
	}
	
	@Test
	public void testSinH() {
		
		double randomValue = 0.0;
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			// Måste ju görs en beräkning i varje loop. firstNo.byteValue
			
			LOG.info("Testing add positive with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (ac.sinh(firstNo, secondNo)), Math.round(result), 0.1); //skriver jag cdr. så kommer valid förslag fram
	}
	}
	
}
