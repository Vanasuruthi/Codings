import java.io.*;
public class Factorial
{
  public static void main (String args[]) throws IOException
  {
    int fact=1;
    DataInputStream d =new DataInputStream(System.in);
    System.out.println("Enter a Number:\n");
    int n=Integer.parseInt(d.readLine());
    for(int i=n; i>=1; i--)
    {
        fact=fact*i;
    }
    System.out.println("Factorial of "+n+" is: " +fact);
  }
}
