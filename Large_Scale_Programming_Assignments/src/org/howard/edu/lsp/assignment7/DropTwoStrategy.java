package org.howard.edu.lsp.assignment7;

import java.util.List;
import java.util.Collections;

/**
 * Taiwo Oriowo
 * @author harrie
 *
 */

public class DropTwoStrategy implements AverageStrategy{
	
	/**
	 * This method returns the average grade from a list of grades after dropping the two lowest scores.
	 * If the size of the list is less than 3, it computes the average grade from the available grades without dropping any grades.
	 * @param grades The list of grades.
	 * @return the average grade from the list of grades after dropping the two lowest grades.
	 * @throws EmptyListException
	 */

	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() == 0) {
			throw new EmptyListException("This input list is empty.");
		}
		int total = 0;
		int avg;
		if (grades.size() < 3) {
			for (int i=0; i<grades.size(); i++) {
				total += grades.get(i);
			}
			avg = total / grades.size();
		} else {
			Collections.sort(grades);
			for (int i=2; i<grades.size(); i++) {
				total += grades.get(i);
			}
			avg = total / (grades.size()-2);
		}
		return avg;
	}
	

}
