class DemoArr
{ 
   static int cnt;
   int num;
  DemoArr()
  {
   cnt++;
  }
  DemoArr(int num)
  {
    this.num=num;
    cnt++;
  }
   void disp()
    {
      System.out.println("the"+ cnt +"th object of class DemoArr contains num="+ this.num);
    }

}

public class Arr2
{
public static void main(String args[])
{
   DemoArr arr[]=new DemoArr[5];
int i;
   arr[0]=new DemoArr(23);
   arr[1]=new DemoArr(13);
   arr[2]=new DemoArr();
   arr[3]=new DemoArr(43);
   arr[4]=new DemoArr(53);
   for (i=0;i<arr.length;i++)
    arr[i].disp();
}
}