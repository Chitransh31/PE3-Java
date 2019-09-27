import java.io.*;
import java.util.*;

public class Question11 {
    public static void main(String[] args) throws IOException {
        int i=0;

        HashMap map = new HashMap();
        HashSet set = new HashSet();

        FileInputStream fis = new FileInputStream("src/FileDemo.txt");

        int ch;
        String string=new String();
        while((ch=fis.read())!=-1)
        {
            string+=(char)ch+"";
        }
        StringTokenizer st = new StringTokenizer(string);
        while(st.hasMoreTokens())
        {
            String s =st.nextToken();
            map.put(i+"",s);
            set.add(s);
            i++;
        }
        Iterator iter = set.iterator();
        System.out.println("Occurrence of words like this ");
        while(iter.hasNext())
        {
            String str1;
            int count=0;

            str1=(String)iter.next();

            for(int j=0; j<i ; j++)
            {
                String str2;
                str2=(String)map.get(j+"");
                if(str1.equals(str2))
                    count++;
            }

            System.out.printf( "%10s %10d\n",str1,count);
        }
        System.out.println("total no. of words : "+i);
    }
}
