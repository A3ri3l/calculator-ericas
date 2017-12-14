package com.project.maven.scientificCalculator;

/**
 * 
 * @author erica
 * @version 1.0
 * 
 *          This is where I have all my operations for the basic calculator. It will
 *          handle multiplication, subtraction, addition, division. I've
 *          limited the calculator to take two numbers for each calculation.
 *
 */

public class BasicCalculator implements BasicInterface{

	/**
	 * Here addition is handled.
	 * 
	 * @param firstNo
	 *            is a double
	 * @param secondNo
	 *            is a double
	 * @return the result of the addition
	 */
	public double add(double firstNo, double secondNo) {
		return firstNo + secondNo;
	}

	/**
	 * Here subtraction is handled.
	 * 
	 * @param firstNo
	 *            is a double
	 * @param secondNo
	 *            is a double
	 * @return result of the subtraction
	 */
	public double sub(double firstNo, double secondNo) {
		return firstNo - secondNo;
	}

	/**
	 * Here multiply is handled.
	 * 
	 * @param firstNo
	 *            is a double
	 * @param secondNo
	 *            is a double
	 * @return result of the multiplication
	 */
	public double mul(double firstNo, double secondNo) {
		return firstNo * secondNo;
	}

	/**
	 * Here division is handled. 
	 * 
	 * @param firstNo
	 *            is a double
	 * @param secondNo
	 *            is a double
	 * @return result of the division
	 */
	public double div(double firstNo, double secondNo) {
		if (secondNo == 0.0) {
			System.out.println("Division with zero?");
			return -0.123456789;
		 } else{
			 double result = firstNo / secondNo;
			 return result;
	}

}
}
