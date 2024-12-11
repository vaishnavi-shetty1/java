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
