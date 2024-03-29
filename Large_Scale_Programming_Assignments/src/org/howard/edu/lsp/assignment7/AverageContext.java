package org.howard.edu.lsp.assignment7;

import java.util.*; 

/**
 * Taiwo Oriowo
 * @author harrie
 *
 */

public class AverageContext {
	/**
	 * The average algorithm the user wants to compute the average with.
	 */
	private AverageStrategy strategy;
	
	/**
	 * This method sets the average computing algorithm to work with.
	 * @param strategy The average algorithm to work with.
	 */
	public void setAverageStrategy(AverageStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * This method returns the average grade from a list of grades based on a predicted algorithm.
	 * @param grades The list of grades.
	 * @return the average grade from the list of grades.
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException{
		int average = this.strategy.compute(grades);
		return average;
	}

}
