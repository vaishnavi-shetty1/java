class DivisionByZeroException extends Exception { 
public DivisionByZeroException(String message) { 
super(message); //Calling the constructor 
} 
} 
public class customException { 
// This method performs division and handles exception if it 
happens 
public static double divideMethod(int dividend, int divisor) 
throws DivisionByZeroException { 
try { 
if (divisor == 0) { 
throw new DivisionByZeroException("Division by zero 
is not possible."); 
} 
return dividend / divisor; 
} catch (ArithmeticException e) { 
System.out.println("Arithmetic Exception Occurred in 
this: " + e.getMessage()); 
throw new DivisionByZeroException("Division by zero is 
not possible."); 
} 
} 
public static void main(String[] args) { 
int dividend = 24; 
int divisor = 0; 
try { 
double result = divideMethod(dividend, divisor); 
System.out.println("Result of the Arithmetic operation: " 
+ result); 
} catch (DivisionByZeroException e) { 
System.out.println("Custom Exception occurred: " + 
e.getMessage()); 
} finally { 
System.out.println("Finally block Executed at the end"); 
} 
} 
}
