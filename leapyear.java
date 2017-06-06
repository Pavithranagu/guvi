import java.io.*;
import java.util.*;
public class leapyear
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n%4==0)
{
System.out.print("leap year");
}
else
{
System.out.print("non leapyear");
}
}}
