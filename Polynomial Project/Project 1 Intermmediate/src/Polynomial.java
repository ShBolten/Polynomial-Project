public class Polynomial implements PolyInterface, Comparable<Polynomial>{
		private int [] coefficients = new int[15];
		public Polynomial(int [] coefficients) {
			for (int a = 0; a < coefficients.length-1; a++) {
				this.coefficients[a] = coefficients[a];
			}
			
		}
		// add two polynomials 
		public Polynomial plus(Polynomial that) {
			int [] newCoefficient = new int[15];
			for (int a = 0; a < coefficients.length-1; a++) {
					newCoefficient[a]= this.coefficients[a] + that.coefficients[a];
			}
			
			return new Polynomial(newCoefficient);
		}
		
		// subtract one polynomial from another
		public Polynomial minus(Polynomial that) {
			int [] newCoefficient = new int[15];
			for (int a = 0; a < coefficients.length-1; a++) {
					newCoefficient[a]= this.coefficients[a] - that.coefficients[a];
			}
			
			return new Polynomial(newCoefficient);
		}
		
		// computer the product of two polynomials
		public Polynomial multiply(Polynomial that) {
			int [] newCoefficient = new int[15];
			for (int a = 0; a < coefficients.length-1; a++) {
					newCoefficient[a]= this.coefficients[a] * that.coefficients[a];
			}
			
			return new Polynomial(newCoefficient);
		}
		
		// compute and return the derivative of the Polynomial
		public Polynomial derivative() {
			int [] newCoefficient = new int[15];
			int power = 1;
			for (int a = 1; a < coefficients.length-15; a++) {
					newCoefficient[a-1]= this.coefficients[a] * power;
					++power;
			}
			
			return new Polynomial(newCoefficient);
		}
		
		// return the value of polynomial evaluated for x
		public double evaluate(double x) {
			double c = 0.0;
			for (int a = 0; a < coefficients.length-1; a++) {
					c = (this.coefficients[a] * x) + (double) Math.pow(x, a);
			}
			return c;
		}
		
		// return a String representing the polynomial
		public String toString() {
			String newStr = "";
			for (int a = coefficients.length-1; a > 0; a--) {
				if (this.coefficients[a] != 0)
					newStr += this.coefficients[a] + "x^";
				else
					continue;
			}
			return newStr;
		}
		public int compareTo(Polynomial that) {
			int b = 0;
			for (int a = coefficients.length-1; a > 0; a--) {
				if (this.coefficients[a] == that.coefficients[a])
					continue;
				else if (this.coefficients[a] < that.coefficients[a])
					b = -1;	
				else
					b = 1;
			}
			return b;
	}
}
