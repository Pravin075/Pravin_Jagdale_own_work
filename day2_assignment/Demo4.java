class DemoOb
{
int num;
DemoOb()
{
num=100;
}
DemoOb(int k)
{
this.num=k;
}
void getValues()
{
System.out.println(this.num);
}
}
public class Demo4
{
public static void main(String [] args)
{
DemoOb obj1= new DemoOb();           // it will create object and address stores into reference 
obj1.getValues();             
DemoOb obj2= obj1;                   // it will create reference3 of obj2 and it will assign address stored int obj1 into obj2
obj2.getValues();
obj1=new DemoOb(1000);               // reference obj1 now refering to new object
obj1.getValues();
obj2.getValues();
}
}