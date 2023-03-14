package org.howard.edu.lsp.assignment7;

/**
 * Taiwo Oriowo
 * @author harrie
 *
 */

public class EmptyListException extends Exception {

	private static final long serialVersionUID = -2568545212858570574L;
	
	/**
	 * @param errorMessage This error message to be delivered when an IntegerSetException occurs.
	 */
	public EmptyListException(String errorMessage) {
		super(errorMessage);
	}
}
