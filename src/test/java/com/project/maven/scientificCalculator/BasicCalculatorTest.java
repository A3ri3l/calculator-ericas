package com.project.maven.scientificCalculator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import org.junit.Test;
import com.project.maven.scientificCalculator.BasicCalculator;
import java.util.logging.Logger;

/**
 * Here I will put all my tests for the basic calculations. 
 * 
 * I will use a loop, 50 times each, for positive and negative numbers and zero.
 * 
 * @author erica
 * @version 1.0
 */
public class BasicCalculatorTest {
	private static final Logger LOG = Logger.getLogger(Main.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat(); //Niklas tippsade om den här men fattar inte varför jag behöver den.
	BasicCalculator bc = new BasicCalculator();
	
	double firstNo = 0.0;//Niclas har inne i testet varje gång för att vara säker på nollställning
	double secondNo = 0.0;
	double result = 0.0;


	/**
	 * Here I handle test for the add method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testAddPositive() {
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			secondNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNo + secondNo;
			
			LOG.info("Testing add positive with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (bc.add(firstNo, secondNo)), Math.round(result), 0.1);
		}	
	}
	
	@Test
	public void testAddNegative() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 50; i++) {
			firstNo = Double.valueOf(df.format(-random.nextDouble()*100));
			secondNo = Double.valueOf(df.format(-random.nextDouble()*100));
			result = firstNo + secondNo;
			
			LOG.info("Testing add negative with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (bc.add(firstNo, secondNo)), Math.round(result), 0.1); 
		}	
	}
	
	@Test
	public void testAddZero() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		// 0 + 0
		firstNo = 0.0;
		secondNo = 0.0;
		result = firstNo - secondNo;

		LOG.info("Testing the method sub zero with: " + firstNo + " and " + secondNo);
		assertEquals(Math.round(bc.add(firstNo, secondNo)), Math.round(result), 1);

		// 0 + random
		for (int i = 0; i < 50; i++) {
			firstNo = 0.0;
			secondNo = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNo + secondNo;

			LOG.info("Testing add zero with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round(bc.add(firstNo, secondNo)), Math.round(result), 1);

			// random + 0

			firstNo = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNo = 0;
			result = firstNo + secondNo;

			LOG.info("Testing add zero with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round(bc.add(firstNo, secondNo)), Math.round(result), 1);
		}
	}
	
	/**
	 * Here I handle test for the sub method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testSubPositive() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			secondNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNo - secondNo;
			
			LOG.info("Testing sub positive with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (bc.sub(firstNo, secondNo)), Math.round(result), 0.1);
		}	
	}
	
	@Test
	public void testSubNegative() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 50; i++) {
			firstNo = Double.valueOf(df.format(-random.nextDouble()*100));
			secondNo = Double.valueOf(df.format(-random.nextDouble()*100));
			result = firstNo - secondNo;
			
			LOG.info("Testing sub negative with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (bc.sub(firstNo, secondNo)), Math.round(result), 0.1); 
		}	
	}
	
	@Test
	public void testSubZero() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		// 0 - 0
		firstNo = 0.0;
		secondNo = 0.0;
		result = firstNo - secondNo;

		LOG.info("Testing the method sub zero with: " + firstNo + " and " + secondNo);
		assertEquals(Math.round(bc.sub(firstNo, secondNo)), Math.round(result), 1);

		// 0 + random
		for (int i = 0; i < 50; i++) {
			firstNo = 0.0;
			secondNo = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNo - secondNo;

			LOG.info("Testing sub zero with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round(bc.sub(firstNo, secondNo)), Math.round(result), 1);

			// random + 0
			firstNo = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNo = 0.0;
			result = firstNo - secondNo;

			LOG.info("Testing sub zero with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round(bc.sub(firstNo, secondNo)), Math.round(result), 1);
		}
	}
	
	/**
	 * Here I handle test for the div method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testDivPositive() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			secondNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNo / secondNo;
			
			LOG.info("Testing div positive with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (bc.div(firstNo, secondNo)), Math.round(result), 0.1);
		}	
	}
	
	@Test
	public void testDivNegative() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 50; i++) {
			firstNo = Double.valueOf(df.format(-random.nextDouble()*100));
			secondNo = Double.valueOf(df.format(-random.nextDouble()*100));
			result = firstNo / secondNo;
			
			LOG.info("Testing div negative with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (bc.div(firstNo, secondNo)), Math.round(result), 0.1); 
		}	
	}
	
	@Test
	public void testDivZero() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		// 0 - 0
		firstNo = 0.0;
		secondNo = 0.0;
		result = -0.123456789;

		LOG.info("Testing the method sub zero with: " + firstNo + " and " + secondNo);
		assertEquals(Math.round(bc.div(firstNo, secondNo)), Math.round(result), 1);

		// 0 + random
		for (int i = 0; i < 50; i++) {
			
			firstNo = 0.0;
			secondNo = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNo / secondNo;

			LOG.info("Testing sub zero with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round(bc.div(firstNo, secondNo)), result, 1);

			// random + 0
			firstNo = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNo = 0.0;
			result = -0.123456789;

			LOG.info("Testing sub zero with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round(bc.div(firstNo, secondNo)), result, 1);
		}
	}
	
	/**
	 * Here I handle test for the mul method.
	 * First with positive numbers, then negative and lastly zero.
	 */
	@Test
	public void testMulPositive() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 50; i++) {
			
			firstNo = Double.valueOf(df.format(random.nextDouble()*100));
			secondNo = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNo * secondNo;
			
			LOG.info("Testing mul positive with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (bc.mul(firstNo, secondNo)), Math.round(result), 0.1);
		}	
	}
	
	@Test
	public void testMulNegative() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 50; i++) {
			firstNo = Double.valueOf(df.format(-random.nextDouble()*100));
			secondNo = Double.valueOf(df.format(-random.nextDouble()*100));
			result = firstNo * secondNo;
			
			LOG.info("Testing mul negative with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round (bc.mul(firstNo, secondNo)), Math.round(result), 0.1); 
		}	
	}
	
	@Test
	public void testMulZero() {
		double firstNo = 0.0;
		double secondNo = 0.0;
		double result = 0.0;
		
		// 0 - 0
		firstNo = 0.0;
		secondNo = 0.0;
		result = firstNo * secondNo;

		LOG.info("Testing the method sub zero with: " + firstNo + " and " + secondNo);
		assertEquals(Math.round(bc.mul(firstNo, secondNo)), Math.round(result), 1);

		// 0 + random
		for (int i = 0; i < 50; i++) {
			firstNo = 0.0;
			secondNo = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNo * secondNo;

			LOG.info("Testing sub zero with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round(bc.mul(firstNo, secondNo)), Math.round(result), 1);

			// random + 0
			firstNo = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNo = 0.0;
			result = firstNo * secondNo;

			LOG.info("Testing sub zero with value: " +firstNo +" and " +secondNo +" result: " +result);
			assertEquals(Math.round(bc.mul(firstNo, secondNo)), Math.round(result), 1);
		}
	}

}

