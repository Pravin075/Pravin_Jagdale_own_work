class Num implements Runnable
{
synchronized public void run()
{
for (int i=1;i<=10;i++)
System.out.println(i);
}
}

public class Print4 
{
public static void main(String arg[])
{
Num e1=new Num();
Thread t1=new Thread(e1);
Thread t2=new Thread(e1);
Thread t3=new Thread(e1);
t1.start();
t2.start();
t3.start();
}
}