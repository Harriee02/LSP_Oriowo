package org.howard.edu.lsp.assignment5.implementation;
import java.util.ArrayList;
import java.util.List;

public class IntegerSet{ 
	private List<Integer> set;  
	/**
	 * This is the constructor that initialises the set.
	 */
	public IntegerSet() {
		this.set = new ArrayList<Integer>();
	}
	/**
	 * When called on an integerSet object, this method clears the set reducing the size to 0.
	 */
	public void clear() {
		set.clear();
	}
	/**
	 * This returns the length of the set.
	 * @return
	 */
	public int length() {
		return this.set.size();
	}
	/**
	 * This methods adds integer values to the set.
	 * @param item
	 */
	public void add(int item) {
		if (!(this.set.contains(item))){
			this.set.add(item);
		}
		//System.out.println(this.set);
	}
	/**
	 * Takes in an integerSet object and returns a boolean.This method return True if the IntegerSet
	 * is the same as this.set, and returns False if not.
	 * @param y
	 * @return
	 */
	public boolean equals(IntegerSet y) {
		int count = 0;
		for (int element:this.set) {
			if (y.contains(element)) {
				count++;
			}
		}
		if ((Integer.valueOf(y.length()) == count) && (Integer.valueOf(this.set.size()) == count)) {
			return true;
		}
		return false;
	}
	/**
	 * Takes in an integer value and returns a boolean.This method return True if the value is 
	 * present in the set, and returns False if the value if the value isn't present in the set.
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		for (int element: this.set) {
			if (element== value) {
				return true;
			}
	}
		return false;
		
	}
	/**
	 * This method returns an integer value which is the maximum value in the set
	 * @return
	 */
	public int largest() throws IntegerSetException{
		if (this.set.size() == 0) {
			throw new IntegerSetException("Set should not be empty");
		}
		int max= Integer.MIN_VALUE;
		for (int element:this.set) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}
	/**
	 * This method returns an integer value which is the minimum value in the set
	 * @return
	 */
	public int smallest() throws IntegerSetException{
		if (this.set.size() == 0) {
			throw new IntegerSetException("Set should not be empty");
		}
				int min= Integer.MAX_VALUE;
				for (int element:this.set) {
					if (element < min) {
						min = element;
					}
				}
				return min;
			}
	/**
	 * This method takes in an argument(item), and removes the item if the set if it is present,
	 * but throws an exception if the set is empty.
	 * @param item
	 */
	public void remove(int item) throws IntegerSetException {
		if (this.set.size() == 0) {
			throw new IntegerSetException("Set should not be empty");
		}
		ArrayList<Integer> newList = new ArrayList();
		for (int element: this.set) {
			if (!(element == item)){
				newList.add(element);
			}	
		}
		this.set = newList;
	}
	/**
	 * Takes in an IntegerSet object, called intSetb and adds the integers in this.set to intSetb
	 * making the union of both sets.
	 * @param 
	 */

	public void union(IntegerSet intSetb) {
		ArrayList <Integer> united = new ArrayList();
		for (int element:this.set) {
			if (!(united.contains(element))) {
				united.add(element);
			}
		}
		this.set = united;
	}
	/**
	 * Takes in an IntegerSet object and makes a new array that contains integers that 
	 * are common to both sets.
	 * @param IntSetb
	 */

	public void intersection(IntegerSet IntSetb) {
		ArrayList<Integer> inter = new ArrayList();
		for (int element: this.set) {
			if (IntSetb.contains(element)) {
				inter.add(element);
			}
		}
		this.set = inter;
		
	}
	/**
	 * Takes in an IntegerSet object and makes a new array that contains integers that 
	 * are not common to both sets.
	 * @param IntSetb
	 */
	public void diff(IntegerSet IntSetb) {
		ArrayList<Integer> difference = new ArrayList();
		for (int element: this.set) {
			if (!(IntSetb.contains(element))){
				difference.add(element);
			}
		}
		this.set = difference;
	}
	/**
	 * This method returns a boolean. It returns true if the set is empty, and false if it is not.
	 * @return
	 */
	public boolean isEmpty() {
		if (this.set.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Converts the object of IntegerSet to a string to be printed.
	 */
	public String toString() {
		return this.set.toString();
	}
	
}



