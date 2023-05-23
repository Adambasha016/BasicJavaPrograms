package org.practice.marathahalli;

public class Demo098 {
public static void main(String[] args) {
int a=0;
a=++a;
System.out.println(a);

           System.out.println(a=++a);;
System.out.println(a+"jki");
 System.out.println(a=a++);
System.out.println(a);
System.out.println(a=a++);
System.out.println(a+";l");
int c=0; int b=0;
b=++c + c++ + ++c;
System.out.println(b+""+c);
int i=1,j=1,k=1,m;
m=i-- - j-- - k--;
System.out.println(m+"  "+k+"  "+i+"   "+j);


int q = 11;

int x = 001, y=010, z=100;

int g = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
 
System.out.println("x="+x);
System.out.println("y="+y);
System.out.println("z="+z);
System.out.println("i="+g);

char ch = "123".charAt(1);
System.out.println(ch++);
System.out.println(ch++ + ++ch);
char s = '0';
System.out.println(s);
int r=(int)s;
System.out.println(r+"FFf");
System.out.println(s-- + --s);
}
}
