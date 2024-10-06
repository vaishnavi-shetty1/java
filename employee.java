import java.io.*; 
  public class employee { 
  int EmpId; 
  String Name; 
  double Salary; 
  double percent; 
  employee(){} 
  employee(int Id, String Nm, double sal) 
  { 
  EmpId=Id; 
  Name=Nm; 
  Salary=sal; 
  } 
  void raiseSalary(double p) { 
  Salary= Salary+(Salary*p)/100; 
  System.out.println("Salary after the raise"); 
  disp(); 
  } 
   
void disp() 
{ 
System.out.println(); 
System.out.println("Employee Details :"); 
System.out.println("Employee ID : "+EmpId); 
System.out.println("Employee Name : "+Name); 
System.out.println("Employee Salary: "+Salary); 
} 
public static void main(String args[ ])throws  IOException 
{ 
System.out.print("Enter the Employee ID: "); 
InputStreamReader r= new InputStreamReader(System.in); 
BufferedReader br=new BufferedReader(r); 
int Eid =Integer.parseInt(br.readLine()); 
System.out.print("Enter the Name: "); 
String empName = br.readLine(); 
System.out.print("Enter the Salary: "); 
double empSal=Double.parseDouble(br.readLine()); 
employee emp1 = new employee(Eid,empName,empSal); 
emp1.disp(); 
System.out.print("Enter the Raise in Salary in Percentage: "); 
double pct=Double.parseDouble(br.readLine()); 
emp1.raiseSalary(pct); 
} 
}
