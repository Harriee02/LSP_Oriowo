package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
public class Driver{
//	public IntegerSet toString() {
//		
//	}
	public static void main(String[]args) throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		IntegerSet set5 = new IntegerSet();
		// adds to the set1, set2, set3 and set4
		set1.add(1);
		set2.add(2);
		set3.add(3);
		set1.add(5);
		set2.add(4);
		set3.add(1);
		set1.add(2);
		set2.add(3);
		set3.add(5);
		set1.add(4);
		set2.add(1);
		set3.add(2);
		set1.add(3);
		set2.add(5);
		set3.add(4);
		set5.add(1);
		set5.add(2);
		set5.add(3);
		set5.add(5);
		set5.add(4);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println(set4);
		System.out.println(set5);
		// prints the size of the set
		System.out.println("The length of Set2 is:" + set4.length());
		System.out.println("The length of Set1 is:" + set1.length());
		
		//compares two sets to see if they are the same
		System.out.println("Are these sets equal:" + set3.equals(set5));
		System.out.println("Are these sets equal:" + set4.equals(set2));
		
		//checks if a value is present in a set
		System.out.println("Is this value in the set:" + set3.contains(5));
		System.out.println("Is this value in the set:" + set4.contains(3));
		
		// returns the largest value in the set
		System.out.println("The largest value:" + set3.largest());
		//System.out.println("The largest value:" + set4.largest());
		
		// returns the smallest value in the set
		System.out.println("The smallest value:" + set3.smallest());
		//System.out.println("The smallest value:" + set4.smallest());
		
		//removes a value from the set
		set3.remove(5);
		System.out.println(set3);
		//set4.remove(1);
		
		//joins two set(union)
		set1.union(set5);
		System.out.println("Union of set1 and set5:" + set1.toString());
		set4.union(set2);
		System.out.println("Union of set1 and set5:" + set2.toString());
		
		//intersection
		set1.intersection(set3);
		System.out.println("Intersection of set1 and set3:" + set1.toString());
		set4.intersection(set1);
		System.out.println("Intersection of set4 and set1:" + set4.toString());
		
		//difference
		System.out.println("set2:" + set2.toString());
		System.out.println("set3:" + set3.toString());
		set2.diff(set3);
		System.out.println("Diff of set2 and set3:" + set2.toString());
		set5.diff(set1);
		System.out.println("Diff of set5 and set1:" + set5.toString());
		
		//is empty
		set1.clear();
		System.out.println(set1.toString());
		System.out.println(set2.toString());
		System.out.println("Is this set empty?:" + set1.isEmpty());
		System.out.println("Is this set empty?:" + set2.isEmpty());
		
	}
}
		
