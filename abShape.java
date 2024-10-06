abstract class abShape{ 
public abstract void calculateArea(); 
public abstract void calculatePerimeter(); 
} 
class Circle1 extends abShape { 
double area,radius,perimeter; 
public Circle1(double radius) { 
this.radius=radius; 
} 
public void calculateArea() { 
area=Math.PI*radius*radius; 
System.out.println("Area of the Circle=> "+area); 
} 
public void calculatePerimeter() { 
perimeter=2*Math.PI*radius; 
System.out.println("Perimeter of the Circle=> "+perimeter); 
} 
} 
class Triangle1 extends abShape{ 
double area,perimeter,side1,side2,side3,s; 
public Triangle1(double side1,double side2,double side3) { 
this.side1=side1; 
this.side2=side2; 
this.side3=side3; 
} 
public void calculateArea() { 
// Heron's formula used to calculate the area of a triangle 
s = (side1 + side2 + side3) / 2; 
area= Math.sqrt(s * (s - side1) * (s - side2) * (s - 
side3)); 
System.out.println("Area of the Triangle=> "+area); 
} 
public void calculatePerimeter() { 
perimeter=side1+side2+side3; 
System.out.println("Perimeter of the Triangle=> 
"+perimeter); 
} 
} 
class mainMethod{ 
public static void main (String args[]) { 
Circle1 c1=new Circle1(6.0); 
Triangle1 t1=new Triangle1(4.0,6.0,8.0); 
c1.calculateArea(); 
c1.calculatePerimeter(); 
t1.calculateArea(); 
t1.calculatePerimeter(); 
} 
}
