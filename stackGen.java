import java.io.*; 
public class stackGen { 
int stack[]=new int[10]; 
int top,flg1,flg2; 
public stackGen() { 
top=-1; 
} 
int push(int ele) { 
top++; 
stack[top]=ele; 
if (top==9)  
{ 
System.out.println("Stack is full now"); 
flg1=1; 
} 
} 
return(flg1); 
int pop() { 
System.out.println("Popped Element=> "+stack[top]); 
top--; 
if (top<0) { 
flg2=1; 
System.out.println("Stack is empty now"); 
} 
return(flg2); 
} 
void display() { 
int i; 
System.out.println("The stack elements are:"); 
for(i=top;i>=0;i--){ 
System.out.println(stack[i]); 
} 
} 
public static void main(String args[])throws 
IOException  { 
stackGen stk=new stackGen();  
int el,loop=0; 
InputStreamReader r= new InputStreamReader(System.in); 
BufferedReader br=new BufferedReader(r); 
System.out.println("Push Operation..."); 
while (loop!=1) 
{ 
System.out.print("Enter the Element => ");    
el =Integer.parseInt(br.readLine());  
loop=stk.push(el); 
System.out.println(); 
} 
loop=0; 
System.out.println("Contents of the Stack "); 
stk.display(); 
System.out.println("Pop Operation..."); 
while(loop!=1) 
{ 
loop=stk.pop(); 
} 
System.out.println("Stack Operations Over!!!"); 
} 
}
