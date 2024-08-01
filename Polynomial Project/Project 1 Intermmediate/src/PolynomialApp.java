/**
 * CSC2206 Project 1 class PolynomialApp
 * To test the compareTo method
 */

import java.util.Arrays;

public class PolynomialApp
{
  public static void main(String [] args)
  {
    Polynomial [] polynomials = new Polynomial[5];
    
    int [] c0 = {2, 2, 2, 2};
    int [] c1 = {2, 2, 2};
    int [] c2 = {2, 2, 1};
    int [] c3 = {2, 1, 2};
    int [] c4 = {1, 2, 2};
    polynomials[0] = new Polynomial(c0);  
    polynomials[1] = new Polynomial(c1);  
    polynomials[2] = new Polynomial(c2);  
    polynomials[3] = new Polynomial(c3); 
    polynomials[4] = new Polynomial(c4);
    
    System.out.println("Before sorting:");
    for (Polynomial p : polynomials)
      System.out.println(p);    

    Arrays.sort(polynomials);      // Polynomial [] is widened to Comparable<Polynomial> []
    
    System.out.println("\nAfter sorting:");
    for (Polynomial p : polynomials)
      System.out.println(p);     
  }
}