import java.io.*; 
 
public class cmdTest { 
int a[][]=new int[5][5]; 
int b[][]=new int[5][5]; 
int c[][]=new int[5][5]; 
int n; 
cmdTest(){ 
  
} 
void matRead(int o)throws IOException { 
 int i,j; 
 n=o; 
 System.out.println("Enter the First Matrix"); 
 for(i=0;i<n;i++) 
 { 
   for(j=0;j<o;j++) 
   { 
 InputStreamReader r= new InputStreamReader(System.in); 
 BufferedReader br=new BufferedReader(r); 
 a[i][j] =Integer.parseInt(br.readLine());   
   }    
   } 
 System.out.println("Enter the Second Matrix"); 
 for(i=0;i<n;i++) 
 { 
   for(j=0;j<o;j++) 
   { 
  InputStreamReader r= new InputStreamReader(System.in); 
  BufferedReader br=new BufferedReader(r); 
  b[i][j] =Integer.parseInt(br.readLine());   
   }    
   } 
} 
void matAdd() 
{ 
 int i,j; 
 for(i=0;i<n;i++) 
 { 
  for(j=0;j<n;j++) 
  { 
   c[i][j]=a[i][j]+b[i][j]; 
  } 
 } 
}  
void matDisp() 
{ 
 int i,j; 
 System.out.println("Resultant Matrix is "); 
 for(i=0;i<n;i++) 
 { 
  for(j=0;j<n;j++) 
  { 
   System.out.print(" "+c[i][j]); 
  } 
  System.out.println(); 
 } 
}  
public static void main(String args[]) throws IOException { 
System.out.println("Order of the Matrix: "+args[0]); 
int order; 
cmdTest Mat= new cmdTest(); 
order=Integer.parseInt(args[0]); 
Mat.matRead(order); 
Mat.matAdd(); 
Mat.matDisp(); 
} 
} 
