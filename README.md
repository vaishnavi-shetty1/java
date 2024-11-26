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
