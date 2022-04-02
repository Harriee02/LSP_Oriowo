package org.howard.edu.lsp.assignment6.junit;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;


public class IntegerSetTest {
	@Test
	@DisplayName("IntegerSet.clear() test cases")
	public void testClear() {
		//JUnit test cases for the clear method
		IntegerSet set1 = new IntegerSet();
		assertTrue(set1.isEmpty());
		set1.add(1);
		set1.add(4);
		assertFalse(set1.isEmpty());
		set1.clear();
		assertTrue(set1.isEmpty());
		set1.add(3);
		assertFalse(set1.isEmpty());
	}
	@Test
	@DisplayName("IntegerSet.length() test cases")
	public void testLength() {
		//JUnit test cases for the length method
		IntegerSet set1 = new IntegerSet();
		assertTrue(set1.length() == 0);
		set1.add(1);
		set1.add(4);
		assertTrue(set1.length() == 2);
		assertFalse(set1.length() == 0);
		set1.add(3);
		assertFalse(set1.length() == 1);
	}
	@Test
	@DisplayName("IntegerSet.equal(IntegerSet b) test cases")
	public void testEquals() {
		//JUnit test cases for the equals method
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		assertTrue(set2.equals(set1));
		set1.add(1);
		set1.add(4);
		assertFalse(set2.equals(set1));
		set2.add(4);
		set2.add(1);
		assertTrue(set1.equals(set2));
		set2.add(-3);
		assertFalse(set1.equals(set2));
		set1.add(3);
		assertFalse(set2.equals(set1));
	}
	
	@Test
	@DisplayName("IntegerSet.contains(int a) test cases")
	public void testContains() {
		//JUnit test cases for the contains method
		IntegerSet set1 = new IntegerSet();
		assertFalse(set1.contains(3));
		set1.add(1);
		assertTrue(set1.contains(1));
		assertFalse(set1.contains(3));
		set1.add(-1);
		assertTrue(set1.contains(-1));
	}
	
	@Test
	@DisplayName("IntegerSet.largest() test cases")
	public void testLargest() throws Exception{
		//JUnit test cases for the largest method
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		assertTrue(set1.largest()==10);
		set1.add(200);
		assertTrue(set1.largest() == 200);
		assertFalse(set1.largest()== 10);
		set1.remove(200);
		assertTrue(set1.largest() == 10);
		
	}
	
	@Test
	@DisplayName("IntegerSet.largest() throws exception")
	public void testLargest_THROWS_EXCEPTION(){
		//JUnit test cases for the largest method
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			set1.largest(); 
		});
		
		String expectedMessage = "Set should not be empty";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
	

	@Test
	@DisplayName("IntegerSet.smallest() test cases")
	public void testSmallest() throws Exception{
		//JUnit test cases for the smallest method
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		assertTrue(set1.smallest()==10);
		set1.add(200);
		assertFalse(set1.smallest() == 200);
		assertTrue(set1.smallest()== 10);
		set1.remove(10);
		assertTrue(set1.smallest()== 200);
	}
	
	@Test
	@DisplayName("IntegerSet.largest() throws exception")
	public void testSmallest_THROWS_EXCEPTION(){
		//JUnit test cases for the smallest method
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			set1.smallest(); 
		});
		
		String expectedMessage = "Set should not be empty";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
	@DisplayName("IntegerSet.add() test cases")
	public void testAdd() {
		//JUnit test cases for the add method
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(1);
		assertFalse(set1.length() ==2);
		assertTrue(set1.toString().equals("[1]"));
		set1.add(1);
		assertTrue(set1.length() ==1);
		set1.add(10);
		set1.add(18);
		assertFalse(set1.length() ==5);
		set1.add(23);
		assertTrue(set1.toString().equals("[1, 10, 18, 23]"));
		assertFalse(set1.toString().equals("[1,10,18]"));

		
	}
	
	@Test
	@DisplayName("IntegerSet.remove() test cases")
	public void testRemove() throws Exception {
		//JUnit test cases for the remove method
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		set1.add(11);
		set1.remove(10);
		assertTrue(set1.toString().equals("[11]"));
		set1.remove(11);
		assertTrue(set1.toString().equals("[]"));
		assertFalse(set1.toString().equals("[123]"));
	}
	
	@Test
	@DisplayName("IntegerSet.largest() throws exception")
	public void testRemove_THROWS_EXCEPTION(){
		//JUnit test cases for the remove method
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			set1.remove(10); 
		});
		
		String expectedMessage = "Set should not be empty";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	
	@Test
	@DisplayName("IntegerSet.union(IntegerSet a) test cases")
	public void testUnion() {
		//JUnit test cases for the union  method
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.add(1);
		set1.add(1);
		set1.union(set2);
		set3.add(1);
		assertTrue(set1.equals(set3));
		set2.add(1);
		assertTrue(set2.equals(set1));
		set1.add(2);
		set1.add(0);
		set2.add(3);
		set2.add(10);
		set1.union(set2);
		set3.clear();
		set3.add(1);
		set3.add(2);
		set3.add(0);
		set3.add(3);
		set3.add(10);
		assertTrue(set1.equals(set3));
	}
	
	@Test
	@DisplayName("IntegerSet.intersection(IntegerSet a) test cases")
	public void testIntersection() {
		//JUnit test cases for the intersection method
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set1.intersection(set2);
		set3.add(3);
		set3.add(4);
		assertTrue(set3.equals(set1));
	}
	
	@Test
	@DisplayName("IntegerSet.diff(IntegerSet a) test cases")
	public void testDiff() {
		//JUnit test cases for the diff method
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set1.diff(set2);
		set3.add(1);
		set3.add(2);
		set3.add(5);
		set3.add(6);
		assertTrue(set3.equals(set1));
	}
	
	@Test
	@DisplayName("IntegerSet.empty() test cases")
	public void testIs_Empty() {
		//JUnit test cases for the empty method
		IntegerSet set1 = new IntegerSet();
		assertTrue(set1.isEmpty());
		set1.add(0);
		assertFalse(set1.isEmpty());
		set1.clear();
		set1.add(3);
		assertFalse(set1.isEmpty());
		set1.clear();
		assertTrue(set1.isEmpty());
		
	}
	
	@Test
	@DisplayName("IntegerSet.toString(IntegerSet a) test cases")
	public void testTo_String() {
		//JUnit test cases for toString method
		IntegerSet set1 = new IntegerSet();
		set1.add(19);
		assertTrue(set1.toString().equals("[19]"));
		assertFalse(set1.toString().equals("[]"));
		set1.clear();
		assertTrue(set1.toString().equals("[]"));
		
	}
}	
