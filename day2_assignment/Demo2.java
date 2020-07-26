
class MyClass
{
int one;
int two;
MyClass()
{
this.one=100;
this.two=200;
}
MyClass(int one)
{
this.one=one;
this.two=400;
}
MyClass(int one,int two)
{
this.one=one;
this.two=two;
}
void getValues()
{
System.out.println("one="+ this.one +"two="+ this.two);
}
}
public class Demo2
{
public static void main(String args[])
{
MyClass ob1=new MyClass();
MyClass ob2= new MyClass(300);
MyClass ob3= new MyClass(40,50);
ob1.getValues();
ob2.getValues();
ob3.getValues();
}
}