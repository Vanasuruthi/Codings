import java.io.*;
public class ReverseInteger
{
  public static void main(String args[])throws IOException
  {
      int revInt=0,lastDigit;
      DataInputStream d= new DataInputStream(System.in);
      int n= Integer.parseInt(d.readLine());
      int num=n;
      while(n>0)
      {
          lastDigit=n%10;
          revInt=(revInt*10)+lastDigit;
          n=n/10;
      }
      System.out.println("Reverse of Given Integer "+num+" is: "+revInt);
  }
}
