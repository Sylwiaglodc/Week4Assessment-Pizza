/**
 * @author sylw - srglod
 * CIS175 - Spring 2023
 * Feb 1, 2023
 */
package model;

public class Pizza {
	
	int meatTopping;
	int veggieTopping;
	
	public Pizza() {
		super();
		
	}
	
	
	public Pizza(int meatTopping, int veggieTopping) {
		super();
		this.meatTopping = meatTopping;
		this.veggieTopping = veggieTopping;
	}
	
	
	public double getMeatTopping() {
		return meatTopping;
	}
	public void setMeatTopping(int meatTopping) {
		this.meatTopping = meatTopping;
	}
	public double getVeggieTopping() {
		return veggieTopping;
	}
	public void setVeggieTopping(int veggieTopping) {
		this.veggieTopping = veggieTopping;
	}
	
	public int setPizzaPrice(int veggieTop, int meatTop) {
		
		return veggieTop + meatTop;
		
	}
	
	
}
