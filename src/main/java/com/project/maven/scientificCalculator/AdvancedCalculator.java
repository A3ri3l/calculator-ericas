package com.project.maven.scientificCalculator;

/**
 * 
 * @author erica
 * @version 1.0
 * 
 *          This is where I have all my operations for the basic calculator. It will
 *          handle pi, sin, sinh, hex, square root and plusminus. 
 *
 */

public class AdvancedCalculator implements AdvancedInterface {
	
	/**
	 * Here pi is handled. 
	 * 
	 * @param firstNo is a double
	 * @param pi is a double
	 * @return result of calculation
	 */
	public double pi(double firstNo) { //har jag verkligen gjort rätt här och i interface?? Fråga Niklas eller Rafael på torsdag.
		return (Math.PI * firstNo);
	}
	
	/**
	 * Here sin is handled. 
	 * 
	 * @param firstNo is a double
	 * @param sin is a double
	 * @return result of the calculation
	 */
	public double sin(double firstNo) {
		return (Math.sin(firstNo));
	}
	
	/**
	 * Here sinh is handled.
	 * 
	 * @param firstNo is a double
	 * @param sinh is a double
	 * @return result of calculation
	 */
	public double sinh(double firstNo) {
		return (Math.sinh( firstNo));
	}
	
/**
 * Here log is handled.
 * 
 * @param firstNo is a double
 * @param log is a double
 * @return result of calculation
 */
	public double log(double firstNo) {
		return (Math.log(firstNo));
	}
	
	/**
	 * Here square Root is handled.
	 * 
	 * @param firstNo is a double
	 * @param squareRoot is a double
	 * @return result of calculation
	 */
	public double squareRoot(double firstNo) {
		return (Math.sqrt(firstNo));
	}
	
	/**
	 * Here plusMinus is handled.
	 * 
	 * @param firstNo is a double
	 * @param plusMinus changes a positive value to negative.
	 * @return result of conversion.
	 */
	public double plusMinus(double firstNo) { //Vet inte hur jag ska göra. Hittar inte Math. för den här!!! Blir galen!
		return (firstNo * (-1));
	}	

}
