class Item
{
String itemid;
String name;
int cost;
Item()
{}
Item(String itemid,String name,int cost)
{
this.itemid=itemid;
this.name=name;
this.cost=cost;
}
void disp()
{
   System.out.println("itemid="+this.itemid +" name="+ this.name +" cost="+ this.cost);
}
}

public class ItemDemo
{
public static void main(String ag[])
{
Item i1=new Item("12345","phone",22330);
i1.disp();
}
}