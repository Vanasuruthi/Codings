import java.io.*;
public class ConcatLargestInteger
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter Array Length:\n");
        int n=Integer.parseInt(d.readLine());
        int array=new int[n];
        for(int i=0; i<n; i++)
        {
            array[i]=Integer.parseInt(d.readLine());
        }
        int largest=array[0];
        for(int i=1; i<n; i++)
        {
            int num=array[i]/10;
            int large=largest/10;
            while(num > 0 && large >0)
            {
                if(num > large)
                largest=array[i];
                numRem=num % 10;
                num=numRem/10;
                largeRem=largest % 10;
                large=largeRem % 10;
            }
        }
    }
}
