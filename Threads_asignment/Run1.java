class A 
{
synchronized  void disp(int k)
{
System.out.println(k);
notifyAll();
try
{
wait();
Thread.sleep(200);
}
catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}

class One implements Runnable
{
A ref;
One(A ref)
{
this.ref=ref;
}
public void run()
{
for (int i=1;i<=50;i++)
{
    ref.disp(i);
}
}
}

class Two implements Runnable
{
A ref;
Two(A ref)
{
this.ref=ref;
}
public void run()
{
for (int i=50;i>0;i--)
{
    ref.disp(i);
}
}
}

public class Run1 
{
public static void main(String ar[])
{
A ob1 = new A();
One ob2=new One(ob1);
Two ob3=new Two(ob1);
Thread t1=new Thread(ob2);
Thread t2=new Thread(ob3);
t1.start();
t2.start();
}
}







