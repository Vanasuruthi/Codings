import java.io.*;
public class MatchIndex
{
    public void findIndex(int n,int[] a)
    {
        for(int i=0; i<n; i++)
        {
            if(i==a[i])
            {
              System.out.println("The Number " +a[i]+" equal to the Index "+i);
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter Size of Array:\n" );
        int n=Integer.parseInt(d.readLine());
        int[] a=new int[n];
        System.out.println("Enter Array Elements:\n" );
        for (int i=0; i<n; i++)
        {
            a[i]=Integer.parseInt(d.readLine());
        }
        MatchIndex mi=new MatchIndex();
        mi.findIndex(n,a);
    }
}
