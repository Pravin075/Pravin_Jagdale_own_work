class Exec implements Runnable
{
synchronized public void run()
{
for (int i=0;i<5;i++)
System.out.println("Exec "+i);
}
}

public class Print3 
{
public static void main(String arg[])
{
Exec e1=new Exec();
Thread t1=new Thread(e1);
Thread t2=new Thread(e1);
Thread t3=new Thread(e1);
t1.start();
t2.start();
t3.start();
}
}