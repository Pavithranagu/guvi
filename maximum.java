import java.io.*;
import java.util.*;
public class max
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int temp=0;
int a[]=new int[3];
for(int i=0;i<3;i++)
{
a[i]=s.nextInt();
}
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{if(a[j]>=a[k])
  { temp=temp+1;}
if(temp==3)
{System.out.print(a[j]);}
}
temp=0;}
}}
