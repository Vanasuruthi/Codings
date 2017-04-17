import java.io.*;
import java.util.*;
public class Reverse
{
  public static void main(String args[])throws IOException
  {
    System.out.println("Enter a String to Reverse:\n");
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    StringBuilder revStr=new StringBuilder();
    revStr.append(str);
    revStr=revStr.reverse();
    System.out.println("Reverse of "+str+":\n");
    for(int i=0;i<revStr.length();i++)
    {
      System.out.print(revStr.charAt(i));
    }
  }
}
