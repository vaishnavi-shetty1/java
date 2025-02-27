# ExtendThread.java
This is a simple Java program that demonstrates how to create and manage threads by extending the Thread class. The program showcases the concept of multi-threading, where the main thread and a child thread run concurrently.

Program Overview
- The program defines a class NewThread that extends the Thread class and overrides its run() method.
- The child thread (NewThread) prints numbers from 5 to 1 with a delay of 500ms between each print.
- The main thread does the same, printing numbers from 5 to 1 with a delay of 1000ms.
- Both threads (main and child) run concurrently and demonstrate thread execution and interruption.
  
Features
- Demonstrates thread creation by extending the Thread class.
- Uses the Thread.sleep() method to simulate some delay between prints.
- Includes basic exception handling with InterruptedException.
- Shows how two threads (main and child) can run concurrently.

# InterfaceMain.java
This Java program demonstrates the use of an interface (Resizable) and its implementation in a Rectangle class. The interface allows for resizing the width and height of a rectangle, and the Rectangle class provides the actual resizing logic.

Features
* Resizable Interface: Defines two methods for resizing:
  * resizeWidth(int width): Resizes the width of the object.
  * resizeHeight(int height): Resizes the height of the object.
* Rectangle Class: Implements the Resizable interface and provides logic for resizing the rectangle's dimensions.
  * The constructor initializes the rectangle with a specified width and height.
  * Methods are provided to resize both the width and height of the rectangle.
  
Program Description

The program demonstrates how interfaces can be used to define common behaviors that multiple classes can implement. In this case, the Resizable interface defines the resizing operations, and the Rectangle class implements those operations to modify its width and height.

Example Flow:
1. The Rectangle object is created with initial dimensions (width = 5, height = 6).
2. The width is resized to 12, and the updated width is printed.
3. The height is resized to 21, and the updated height is printed.
   
Code Structure
* Resizable Interface
  * Contains methods for resizing width and height.
* Rectangle Class
  * Implements the Resizable interface.
  * Initializes the rectangle dimensions via the constructor.
  * Provides logic for resizing width and height and prints the updated values.
* InterfaceMain Class
  * Contains the main method to test the Rectangle class and the resizing functionality.

# MultiThreads.java
This program demonstrates the use of multi-threading in Java. It creates and manages multiple threads by both extending the Thread class and implementing the Runnable interface. The program creates three child threads, each with a different name, and shows how they run concurrently with the main thread.

Program Overview
- TestThread Class: This class extends Thread and implements Runnable. It has a constructor that accepts a thread name and a run() method that is executed when the thread is started. The run() method prints the name of the thread and then exits after a short sleep.
- MultiThreads Class: This is the main class, which creates three TestThread instances (each representing a separate thread), starts them, and prints a message from the main thread.

Features
- Demonstrates thread creation using both extending the Thread class and implementing the Runnable interface.
- Each thread prints its name and exits after sleeping for 500ms.
- The main thread executes before the child threads start running, demonstrating thread concurrency.
- Handles InterruptedException in case a thread is interrupted during its execution.

# MyPoints.java
The MyPoints class represents a 2D point with x and y coordinates. This class includes methods for setting and getting coordinates, calculating distances between points, and providing string representations of points. It demonstrates the use of constructors, method overloading, and array handling in Java.

Features
- Default Constructor: Initializes the point to (0, 0).
- Overloaded Constructor: Initializes the point with specified x and y values.
- Set and Get Coordinates: Allows updating and retrieving the x and y coordinates.
- Distance Calculations: Includes methods to calculate the distance between two points, as well as from a point to the origin (0, 0).
- String Representation: Provides a method to return the point in the form (x, y).

# NestedClassDemo.java
This project demonstrates the use of nested classes in Java. Specifically, it shows how to use inner classes defined within an outer class. The example consists of two classes:
- Outer class (Outer): Contains member variables x and y, a constructor to initialize them, and a method display() to print their values.
- Inner class (Inner): Defined within the Outer class, it contains its own member variables m and n, a constructor to initialize them, and a method display() to print their values.
  
Features
- Outer Class: Demonstrates how an outer class can hold data and functionality that is separate from an inner class.
- Inner Class: Shows how an inner class can access and operate on its own data and can be instantiated from the outer class.
- Nested Class Instantiation: Illustrates how to instantiate an inner class using an instance of the outer class.

Explanation
- The Outer class has two integer variables (x and y) and a method display() to print their values.
- The Inner class is defined inside the Outer class and has its own variables (m and n). The display() method of the Inner class prints its own variables.
- In the NestedClassDemo class, the Outer object is created and its display() method is called.
- The Inner class is instantiated using the outerObj.new Inner(5, 15) syntax, which demonstrates how to create an instance of an inner class from an instance of the outer class. The Inner class's display() method is then called.

# Poly.java
This project demonstrates the concept of polymorphism in Java through the use of method overriding in a simple shape drawing application. The example features a base class Shape and three subclasses: Circle, Triangle, and Square. The methods draw() and erase() are overridden in each subclass to provide specific implementations.

Features
- Base Class (Shape): Contains generic methods draw() and erase() that are meant to be overridden by subclasses.
- Derived Classes (Circle, Triangle, Square): Each class overrides the draw() and erase() methods to provide specific behavior for different shapes.
- Polymorphism: The program demonstrates polymorphism by using a reference of type Shape to refer to objects of the subclasses and call their overridden methods.

Explanation
- Base Class (Shape): The Shape class contains two methods, draw() and erase(), which provide generic implementations for drawing and erasing a shape. These methods are intended to be overridden by subclasses.
- Derived Classes: The Circle, Triangle, and Square classes extend the Shape class and provide their own implementations of draw() and erase(), which are specific to each shape.
- Polymorphism: In the Poly class, a reference of type Shape is used to point to instances of Circle, Triangle, and Square. This demonstrates polymorphism, where the actual method invoked depends on the object's runtime type, not the reference type. The displayShape() method accepts a Shape object and calls its draw() and erase() methods, showcasing dynamic method dispatch.

# abShape.java
This project demonstrates the use of abstract classes and method overriding in Java to calculate the area and perimeter of different geometric shapes. The example defines an abstract class abShape with abstract methods calculateArea() and calculatePerimeter(). Two concrete classes, Circle1 and Triangle1, extend abShape and provide specific implementations for calculating the area and perimeter for a circle and a triangle.

Features
- Abstract Class (abShape): Defines the structure for shapes with abstract methods calculateArea() and calculatePerimeter().
- Concrete Classes (Circle1, Triangle1): Each class implements the abstract methods for calculating the area and perimeter of specific shapes (circle and triangle).
- Heron’s Formula: Used in the Triangle1 class to calculate the area of a triangle given its three sides.

Explanation
- Abstract Classes: abShape is an abstract class that cannot be instantiated directly. It forces any subclass to implement the calculateArea() and calculatePerimeter() methods.
- Polymorphism: By using the abstract class abShape as the reference type for both Circle1 and Triangle1, the program demonstrates polymorphism. The correct calculateArea() and calculatePerimeter() methods are invoked based on the actual object type at runtime.
- Heron's Formula: The Triangle1 class uses Heron's formula to calculate the area of the triangle, which is particularly useful when only the sides of the triangle are known.

# cmdTest.java
This is a simple Java program that performs matrix addition. It reads two matrices from the user input, adds them, and then displays the resultant matrix.

Features
- Takes the order of the matrices as input from the command line.
- Reads two matrices of the given order.
- Adds the two matrices element-wise.
- Displays the resulting matrix after addition.

Code Explanation
- Matrix Initialization: The program creates two 2D arrays (a and b) to hold the values of the two matrices, and another 2D array (c) to store the result of their addition.
- Matrix Input: The matRead() method reads the matrix values from the user. It uses BufferedReader to take input from the command line.
- Matrix Addition: The matAdd() method adds the two matrices element by element and stores the result in the c array.
- Matrix Output: The matDisp() method prints the resulting matrix.

# customException
This Java program demonstrates the use of custom exceptions to handle division by zero errors. It defines a custom exception class DivisionByZeroException and uses it in a method that performs division. If the divisor is zero, the program throws and catches a custom exception to handle the error gracefully.

Features
- Demonstrates how to create and use custom exceptions in Java.
- Handles division by zero errors with a custom exception (DivisionByZeroException).
- Uses a try-catch-finally block to handle errors and ensure the execution of clean-up code.
- Provides detailed error messages for users when a division by zero occurs.

# employee.java
This is a simple Java program that allows input of employee details (ID, name, and salary) and then calculates a salary raise based on a percentage provided by the user. The program displays employee information before and after the salary raise.

Features:
- Input employee ID, name, and salary.
- Display employee details.
- Apply salary raise based on the provided percentage.
- Display updated employee salary after the raise.

Code Explanation:
- employee class: Contains attributes like EmpId, Name, Salary, and percent.
  - Constructor initializes the employee details.
  - raiseSalary(double p) method calculates the new salary after applying the raise.
  - disp() method prints the employee details to the console.
- Main method: Takes input for employee details, creates an instance of the employee class, displays the details, and applies the salary raise based on the entered percentage.

# stackGen.java
This is a Java program that simulates stack operations such as push and pop on a stack of integers. The program demonstrates how to manage a stack, handle overflow/underflow conditions, and display the stack elements.

Features:
- Push operation: Allows the user to insert elements into the stack until it reaches its maximum size.
- Pop operation: Allows the user to remove elements from the stack and displays the popped element.
- Display stack: Shows the current contents of the stack.
- Overflow and underflow handling: Alerts the user when the stack is full (overflow) or empty (underflow).

Code Explanation:
- stackGen class:
  - stack[]: An array of size 10 used to store the stack elements.
  - top: Keeps track of the top element index in the stack.
  - push(int ele): Pushes an element onto the stack. It checks for stack overflow and returns a flag.
  - pop(): Pops an element from the stack and prints it. It checks for stack underflow and returns a flag.
  - display(): Displays all the elements currently in the stack.
- Main method:
  - Prompts the user for input and calls the push method until the stack is full.
  - After pushing elements, it displays the stack and proceeds with the pop operation to remove and display elements until the stack is empty.
