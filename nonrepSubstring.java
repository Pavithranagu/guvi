import java.util.*;
class nonrepSubstring
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String ss=s.next();
        int count =1,k=0,h=0,count1=0;
        String ns[]=new String[ss.length()];
        for(int i=0;i<ss.length();i++)
        {
            for(int j=i+1;j<ss.length();j++)
            {
                if(ss.charAt(i)!=ss.charAt(j))
                {
                    count++;
                }
                else
                break;
            }
            ns[k]=new String(ss.substring(i,i+count));
            k=k+1;
            count=1;
        }
        for(int x=0;x<ns.length;x++)
        {
        int l=ns[x].length();
         if(count1<l)
         {
             count1=l;
            h=x;
         }
        }
        System.out.println(ns[h]);
    }
}
