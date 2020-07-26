class A
{
static int sn1;
int num1;
A()
{
sn1++;
this.num1=10;
}
A(int k)
{
sn1++;
this.num1=k;
}
void getValue()
{
System.out.println("num1="+ this.num1);
}
static void getStatic()
{
System.out.println("sn1="+ sn1);
}
}

class B
{
static int sn2;
int num2;
B()
{
sn2++;
this.num2=20;
}
B(int k)
{
sn2++;
this.num2=k;
}
void getValue()
{
System.out.println("num2="+ this.num2);
}
static void getStatic()
{
System.out.println("sn2="+ sn2);
}
}

class C
{
static int sn3;
int num3;
C()
{
sn3=10000;
this.num3=30;
}
C(int k)
{
sn3=10000;
this.num3=k;
}
void getValue()
{
System.out.println("num3="+ this.num3);
}
static void getStatic()
{
System.out.println("sn3="+ sn3);
}
}

public class Demo5
{
public static void main(String args[])
{
A.getStatic();
A ob1= new A();
ob1.getValue();
A.getStatic();

B.getStatic();
B ob2= new B(2000);
ob2.getValue();
B.getStatic();

C.getStatic();
C ob3= new C(3000);
ob3.getValue();
C.getStatic();
}
}











