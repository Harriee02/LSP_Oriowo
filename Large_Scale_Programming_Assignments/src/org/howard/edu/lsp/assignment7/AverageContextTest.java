package org.howard.edu.lsp.assignment7;

import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageContextTest {
	@Test
	@DisplayName("Test cases for AverageContext.compute")
	public void testCompute() {
		AverageContext avg = new AverageContext();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		avg.setAverageStrategy(new DefaultAverageStrategy());
		try {
			assertEquals(2, avg.compute(list1));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		avg.setAverageStrategy(new DropTwoStrategy());
		try {
			assertEquals(3, avg.compute(list1));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test cases for when both strategies throw an EmptyListException")
	public void testCompute_Throws_EmptyListException_1() {
		AverageContext avg = new AverageContext();
		List<Integer> list1 = new ArrayList<Integer>();
		avg.setAverageStrategy(new DefaultAverageStrategy());
		EmptyListException exception1 = assertThrows(EmptyListException.class, () -> {
			System.out.println(avg.compute(list1));
		});
		assertEquals("The input list is empty.", exception1.getMessage());
		
		avg.setAverageStrategy(new DropTwoStrategy());
		EmptyListException exception2 = assertThrows(EmptyListException.class, () -> {
			System.out.println(avg.compute(list1));
		});
		assertEquals("This input list is empty.", exception2.getMessage());
	}
	
	@Test
	@DisplayName("Test cases for when DropTwoAverageStrategy.compute does not drop any scores")
	public void testCompute_Throws_EmptyListException_2() {
		AverageContext avg = new AverageContext();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(10);
		avg.setAverageStrategy(new DefaultAverageStrategy());
		try {
			assertEquals(9, avg.compute(list1));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		avg.setAverageStrategy(new DropTwoStrategy());
		try {
			assertEquals(9, avg.compute(list1));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test case for when the average value is rounded down")
	public void testCompute_RoundedDown() {
		AverageContext avg = new AverageContext();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		avg.setAverageStrategy(new DefaultAverageStrategy());
		try {
			assertEquals(4, avg.compute(list1));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		avg.setAverageStrategy(new DropTwoStrategy());
		try {
			assertEquals(5, avg.compute(list1));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}

}
