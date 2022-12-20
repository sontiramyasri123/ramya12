import java.io.*;
import java.util.*;
class pr
{
void disp(int a,int b)
{
System.out.println(a+","+b);
}
}
class ch
{
void disp(int a,int b)
{
System.out.print(a+","+b);
}
}
class my
{
public static void main(String args[])
{
pr o=new pr();
o.disp(5,6);
ch o1=new ch();
o1.disp(7,8);
}
}