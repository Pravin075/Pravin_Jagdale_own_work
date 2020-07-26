class Emp
{
private static int cnt;
int one;
int two;
{
cnt++;
}
Emp()
{
one=10;
two=20;
}
Emp(int k, int n)
{
this.one=k;
this.two=n;
}
void getValues()
{
System.out.println("one="+ this.one +"two="+ this.two);
}
static void getCnt()
{
System.out.println("cnt="+ cnt);
}
}
public class Demo3
{
public static void main(String args[])
{
Emp.getCnt();
Emp ob1= new Emp();
Emp.getCnt();
ob1.getValues();
Emp ob2= new Emp(100,200);
Emp.getCnt();
ob2.getValues();
}
}