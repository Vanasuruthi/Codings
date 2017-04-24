import java.io.*;
public class RemoveDuplicate
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        String str=d.readLine();
        char[] c=new char[];
        c=str.toCharArray();
        Set<Character> setChar=new LinkedHashSet<Characters>();
        for(char ch: c)
        {
            setChar.add(ch);
        }
        StringBuffer sb=new StringBuffer();
        for(Character ch:setChar)
        {
            sb.append(ch);
        }
        System.out.println(sb.toString);
    }
}
