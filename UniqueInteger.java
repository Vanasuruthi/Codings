import java.io.*;
public class UniqueInteger
{
    public static void main(String args[])throws IOException
    {
        boolean flag=false;
        DataInputStream d =new DataInputStream(System.in);
        System.out.println("Enter size:\n");
        int n=Integer.parseInt(d.readLine());
        int[] a=new a[n];
        for(int i=0; i<n; i++)
        {
           for(int j=i+1; j<n; j++)
           {
              if(a[i]==a[j])
              {
                flag=true;
                break;
              }
           }
           if(flag==false)
           {
              System.out.println("Unique Element is : "+a[i]);
              break;
           }
        }
    }
}
