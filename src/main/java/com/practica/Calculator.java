package main.java.com.practica;

public class Calculator {
	 public int divide(int a, int b) {
	 return a / b; // Bug: sin control de division por cero
	 }
	 public String status(int val) {
	 String s = null;
	 if (val > 0) s = "positive";
	 return s.toUpperCase(); // Bug: NullPointerException potencial
	 }
	 private void unused() { 
		 System.out.println(""); // Code smell
	 } 
}
