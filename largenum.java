import java.io.*;
import java.util.*;
class largenum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        int a[]=new int[args.length];
        int b[]=new int[args.length];
        int k=0,l=0;
        for(int i=0;i<args.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        n=args.length;
        Arrays.sort(a);
        for(int j=n-1;j>=0;j--)
        {
            b[k]=a[j];
            k=k+1;
        }
        
        String c=Arrays.toString(b);
        c=c.substring(1,c.length()-1);
        c=c.replace(",","");
        c=c.replace(" ","");
        if(c.length()%3==0)
        {
            l=3;
        }
        else
        {l=c.length()%3;}
        StringBuffer cc=new StringBuffer(c);
        while(l<cc.length())
        {
            cc=cc.insert(l,',');
            l=l+4;
        }
        System.out.println(cc);
    }
}
