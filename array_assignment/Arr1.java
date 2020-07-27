public class Arr1
{
public static void main(String args[])
{
   int arr[]=new int[5];
int i,n,j,t;
   arr[0]=12;
   arr[1]=4;
   arr[2]=36;
   arr[3]=43;
   arr[4]=2;
    n=arr.length;
  for (i=0;i<n-1;i++)
     {
        for (j=0;j<n-1-i;j++)
          {
             if (arr[j]>arr[j+1])
               {
                 t=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=t;
               }
          }
     }


   for (i=0;i<arr.length;i++)
    System.out.println(arr[i]);
}
}