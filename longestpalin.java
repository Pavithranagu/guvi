import java.io.*;
import java.util.*;
class palin2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String ss=s.next();
int count=0,k=0,h=0;
String str[]=new String[ss.length()];
int l=ss.length();
for(int i=0;i<l;i++)
{
for(int j=l-1;j>=0;j--)
{
if(ss.charAt(i)==ss.charAt(j))
{
StringBuffer s1=new StringBuffer(ss.substring(i,j+1));
StringBuffer sss=s1;
String ns=new String(sss);
StringBuffer s2=s1;
s2.reverse();
String nws=new String(s2);
if(ns.equals(nws)==true)
{
str[k]=ns;
k=k+1;
break;
}}
}}
for(int y=0;y<str.length;y++)
{int c=str[y].length();
if(c>count)
{
count=c;
h=y;
}}
System.out.println(str[h]);
}}
