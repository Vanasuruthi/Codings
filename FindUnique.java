import java.io.*;
public class FindUnique
{
    public static void main(String args[])throws IOException
    {
        boolean isUnique=true;
        DataInputStream d =new DataInputStream(System.in);
        System.out.println("Enter size:\n");
        int n=Integer.parseInt(d.readLine());
        int[] a=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0; i<n; i++)
        {
            a[i]=Integer.parseInt(d.readLine());
        }
        for(int i=0; i<n; i++)
        {
           for(int j=0; j<n; j++)
           {
              if(a[i]==a[j] && i!=j)
              {
                isUnique=false;
                break;
              }
              else
              {
              	isUnique=true;
              }
           }
           if(isUnique==true)
           {
              System.out.println("Unique Element is : "+a[i]);
              break;
           }
        }
    }
}
