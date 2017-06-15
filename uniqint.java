import java.util.*;
class uniqint
{
    public static void main(String args[])

    {
        int a[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        for(int j=0;j<args.length;j++)
        {
            if(j==a[j])
            {
                System.out.println(a[j]);
            }
        }
    }
}
