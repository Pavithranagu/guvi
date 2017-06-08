import java.io.*;
import java.util.*;
class jump
{
public static void main(String[] ar)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array");
int n=s.nextInt();
int flag=0;
int j=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
while(j<n)
{
int k=a[j];
j=j+k;
if(k!=0)
{
     if(j==n-1)
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
}}
