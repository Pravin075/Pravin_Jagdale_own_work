class Shape
{
private int shape;
private int width;
void setValues(int s, int w)
{
this.shape=s;
this.width=w;
}
void getValues()
{
System.out.println("shape="+ this.shape +"width="+ this.width);
}
}
public class MyClass1
{
public static void main(String args [])
{
Shape ob1=new Shape();
ob1.setValues(100,200);
ob1.getValues();
}
}