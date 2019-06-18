
package cse360assign2;

/**
 * 
 * @author thais
 * 
 *
 */

public class AddingMachine {
	
	private int total;
	private String history = "0";
	
	public AddingMachine () {
		
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * returns total
	 * @return total
	 */
	public int getTotal () {
	
		return total;
	
	}
	
	/**
	 * adds value to total
	 * modifies history
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	
	/**
	 * subtracts value from total
	 * modifies history
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	
	/**
	 * returns history of operations
	 * @return history
	 */
	public String toString () {
		return history;
	
	}
	
	
	/**
	 * Not implemented yet
	 */
	public void clear() {
	
	}
}
