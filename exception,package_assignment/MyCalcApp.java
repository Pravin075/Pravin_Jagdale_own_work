

class Calculator
{
   int caldouble(int no) throws MyArithException
{
     if (no==0)
      throw new MyArithException("Zero not allowed");
     if (no<0)
      throw new MyArithException("Negative not allowed");
     else 
      return no*2;
}
}

public class MyCalcApp
{
public static void main(String arg[])
{
Calculator c1=new Calculator();
try
{
int ans=c1.caldouble(-99);
System.out.println(ans);
}
catch( MyArithException ie)
{
System.out.println(ie);
}
}
}