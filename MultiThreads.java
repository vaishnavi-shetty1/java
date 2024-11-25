class TestThread extends Thread implements Runnable
{
String s1;
TestThread (String s1)
{
s1=s;
}
public void run()
{
try{
Thread.sleep(500);
System.out.println("Thread Name:"+s1);
System.out.println("Exiting...."+s1);
}
catch(InterruptedExecption e) {
System.out.println(Thread currentThread().getName()+"Interrupted");
}
}
}
class MultiThreads 
{
public static void main (String args[])
{
TestThread t1=new TestThread("Chlid Thread T1");
TestThread t2=new TestThread("Chlid Thread T2");
TestThread t3=new TestThread("Chlid Thread T3");
t1.start();
t2.start();
t3.start();
System.out.println("Main Thread Before");
}
}
