import java.io.*;
import java.util.*;
class testjump
{
public static void main(String[] ar)
{
int n[]=new int[ar.length];
for(int i=0;i<ar.length;i++)
{
n[i]=Integer.parseInt(ar[i]);
}
int flag=0;
int j=0;
if(j!=ar.length-1)
{
while(j<ar.length)
{
int k=n[j];
j=j+k;
if(k!=0)
{
     if(j==ar.length-1)
    {flag=1;}
}
if(k==0)
{
    break;
}}
if(flag==0)
{
System.out.print("false");
}
else{System.out.print("true");}
}
else
{System.out.print("true");}
}}
