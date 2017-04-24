import java.io.*;
import java.util.*;
public class RemoveDuplicate
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        String str=d.readLine();
        char[] c=new char[str.length()];
        c=str.toCharArray();
        Set<Character> setChar=new LinkedHashSet<Character>();
        for(char ch: c)
        {
            setChar.add(ch);
        }
        StringBuffer sb=new StringBuffer();
        for(Character ch:setChar)
        {
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
