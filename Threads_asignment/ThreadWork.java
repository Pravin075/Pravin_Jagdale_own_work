class A extends Thread
{
public void run()
{
for (int i=1;i<=50;i++)
{
System.out.println(i);
try
{
Thread.sleep(300);
}
catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
}

class B extends Thread
{
public void run()
{
for (int i=50;i>0;i--)
{
System.out.println(i);
try
{
Thread.sleep(300);
}
catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
}

public class ThreadWork
{
public static void main(String arg[])
{
A ob1=new A();
B ob2=new B();
ob1.start();
ob2.start();
}
}