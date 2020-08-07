class Print extends Thread
{
public void run()
{
for(int i=65;i<75;i++)
{
System.out.printf("%c",i);
System.out.println(Thread.currentThread());
}
}
}

public class Print1
{
public static void main(String arf[])
{
Print p1=new Print();
Print p2=new Print();
p1.start();
p2.start();
}
}