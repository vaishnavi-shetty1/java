class shape{  //base class 
void draw() 
{ 
System.out.println("Drawing a General Shape"); 
} 
void erase() 
{ 
System.out.println("Erasing a General  Shape"); 
} 
} 
class Circle extends shape{ 
void draw() 
{ 
System.out.println("Drawing a Circle"); 
} 
void erase() 
{ 
System.out.println("Erasing a Circle"); 
} 
} 
class Triangle extends shape{ 
void draw() 
{ 
System.out.println("Drawing a Triangle"); 
} 
void erase() 
{ 
System.out.println("Erasing a Triangle"); 
} 
} 
class Square extends shape{ 
void draw() 
{ 
System.out.println("Drawing a Square"); 
} 
void erase() 
{ 
System.out.println("Erasing a Square"); 
} 
} 
class Poly{ 
public static void main(String args[]){ 
shape c1=new Circle(); 
shape t1=new Triangle(); 
shape s1=new Square(); 
System.out.println("Methods called using respective objects"); 
c1.draw(); 
c1.erase(); 
t1.draw(); 
t1.erase(); 
s1.draw(); 
s1.erase(); 
System.out.println("Demonstration of Polymorphism"); 
displayShape(c1); 
displayShape(t1); 
displayShape(s1); 
} 
static void displayShape(shape sh) { 
sh.draw(); 
sh.erase(); 
} 
} 
