package org.howard.edu.lsp.assignment7;

import java.util.List;
/**
 * Taiwo Oriowo
 * @author harrie
 *
 */

public class DefaultAverageStrategy implements AverageStrategy {
	
	/**
	 * This method returns the average grade from a list of grades.
	 * @param grades The list of grades.
	 * @return the average grade from the list of grades.
	 * @throws EmptyListException
	 */

	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() == 0) {
			throw new EmptyListException("The input list is empty.");
		}
		int total = 0;
		for (int num: grades) {
			total += num;
		}
		int avg = total / grades.size();
		return avg;
	
	}

}
