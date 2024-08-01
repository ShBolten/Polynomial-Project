/**
 * CSC2206 Project 1 class TestPolynomial
 * 
 */

import junit.framework.TestCase;

public class TestPolynomial extends TestCase
{
  double TOLERANCE = 0.0001;           // tolerance for double equality

  public void testGeneral()
  {
	 int [] c1 = {1, 2, 3, -4};
	 int [] c2 = {0, 1, 2, 3, 4, 5};
    Polynomial p1 = new Polynomial(c1);
    Polynomial p2 = new Polynomial(c2);
    
    assertEquals("-4x^3 +3x^2 +2x^1 +1x^0", p1.toString());
    assertEquals("5x^5 +4x^4 +3x^3 +2x^2 +1x^1", p2.toString());

    assertEquals( -15.0, p1.evaluate(2), TOLERANCE);
    assertEquals(1641.0, p2.evaluate(3), TOLERANCE);
    
    // test compareTo with different degree polynomials
    assertTrue(p1.compareTo(p2) < 0);
    assertTrue(p2.compareTo(p1) > 0);
    
    int [] c3 = {0, 1, 2, 3};
    p2 = new Polynomial(c3);     // test compareTo with same degree but different polynomials
    assertTrue(p1.compareTo(p2) < 0);
    assertTrue(p2.compareTo(p1) > 0);
    
    p1 = new Polynomial(c3);     // test compareTo with equal polynomials
    assertTrue(p1.compareTo(p2) == 0);
  }
  
  public void testPlus()
  {
	 int [] c1 = {1, 2, 3, 4};
	 int [] c2 = {0, 1, 2, 3, 4, 5};
    Polynomial p1 = new Polynomial(c1);
    Polynomial p2 = new Polynomial(c2);
    assertEquals("8x^3 +6x^2 +4x^1 +2x^0", p1.plus(p1).toString());
    assertEquals("5x^5 +4x^4 +7x^3 +5x^2 +3x^1 +1x^0", p1.plus(p2).toString());
    assertEquals("5x^5 +4x^4 +7x^3 +5x^2 +3x^1 +1x^0", p2.plus(p1).toString());
    
  }
  
  public void testMinus()
  {
	 int [] c1 = {1, 2, 3, 4};
	 int [] c2 = {0, 1, 2, 3, 4, 5};
    Polynomial p1 = new Polynomial(c1);
    Polynomial p2 = new Polynomial(c2);
    assertEquals("",p1.minus(p1).toString());
    assertEquals("-5x^5 -4x^4 +1x^3 +1x^2 +1x^1 +1x^0", p1.minus(p2).toString());
    assertEquals("5x^5 +4x^4 -1x^3 -1x^2 -1x^1 -1x^0", p2.minus(p1).toString());
    
  }
  
  public void testMultiply()
  {
	 int [] c1 = {1,1};
	 int [] c2 = {1,2,1};
	 int [] c3 = {1,3,3,1};
    Polynomial p1 = new Polynomial(c1);
    Polynomial p2 = new Polynomial(c2);
    Polynomial p3 = new Polynomial(c3);
    assertTrue(p2.compareTo(p1.multiply(p1)) == 0);
    assertTrue(p3.compareTo(p2.multiply(p1)) == 0);
  }
  
  public void testDerivative()
  {
	 int [] c0 = {0};
	 int [] c1 = {6};
	 int [] c2 = {6, 6};
	 int [] c3 = {3, 6, 3};
	 int [] c4 = {1, 3, 3, 1};
    Polynomial p0 = new Polynomial(c0);
    Polynomial p1 = new Polynomial(c1);
    Polynomial p2 = new Polynomial(c2);
    Polynomial p3 = new Polynomial(c3);
    Polynomial p4 = new Polynomial(c4);
    assertTrue(p0.equals(p1.derivative()));
    assertTrue(p1.equals(p2.derivative()));
    assertTrue(p2.equals(p3.derivative()));
    assertTrue(p3.equals(p4.derivative()));
  }
}