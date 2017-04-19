import java.io.*;
public class ConcatLargestInteger
{
    public static void main(String args[])throws IOException
    {
        String finalInteger=" ";
        int largeRem=0,numRem=0,temp=0,num,large,largest;
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter Array Length:\n");
        int n=Integer.parseInt(d.readLine());
        System.out.println("Enter Array:\n");
        int[] array=new int[n];
        for(int i=0; i<n; i++)
        {
            array[i]=Integer.parseInt(d.readLine());
        }
        for (int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                num=array[j]/10;
                largest=array[i]/10;
                while(num > 0 && largest >0)
                {
                    if(num > largest)
                    {
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                        break;
                    }
                    else if(num==largest)
                    {
                    numRem=num % 10;
                    num=numRem/10;
                    largeRem=largest % 10;
                    large=largeRem / 10;
                    }
                }
            }
        }
    }
}
