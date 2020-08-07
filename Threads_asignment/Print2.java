class PrintR implements Runnable
{
synchronized public void run()
{
for(int i=65;i<75;i++)
{
System.out.printf("%c",i);
System.out.println(Thread.currentThread());
}
}
}

public class Print2
{
public static void main(String arf[])
{
Print p1=new Print();
Thread t1=new Thread(p1);
Thread t2=new Thread(p1);
t1.start();
t2.start();
}}