import java.util.*; 
class leastno
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String ss=s.next();
        int k=s.nextInt();
        int i=0;
        int a=Integer.parseInt(ss);
        int b[]=new int[ss.length()];
        while(a!=0)
        {
            int n=a%10;
            b[i]=n;
            i=i+1;
            a=a/10;
        }
        Arrays.sort(b);
        String ns=Arrays.toString(b);
        ns=ns.substring(1,ns.length()-1);
        ns=ns.replace(",","");
        ns=ns.replace(" ","");
        int g=ns.length();
        ns=ns.substring(0,g-k);
        System.out.println(ns);
    }
}
