
public interface PolyInterface {
	
	// add two polynomials 
	public Polynomial plus(Polynomial that);
	
	// subtract one polynomial from another
	public Polynomial minus(Polynomial that);
	
	// computer the product of two polynomials
	public Polynomial multiply(Polynomial that);
	
	// compute and return the derivative of the Polynomial
	public Polynomial derivative();
	
	// return the value of polynomial evaluated for x
	public double evaluate(double x);
	
	// return a String representing the polynomial
	public String toString();

}
