package com_jsp_oops_obj;

public class Variableargs 
{
public static void m1(int a) 
{
System.out.println("m1(int a): "+a);
}
public static void m2(int a,int b) 
{
System.out.println("m2(int a,int b): "+a+ ","+b);
}
public static void m3(int...a) 
{
System.out.println("m3(int...a): ");
for(int n:a) 
{
	System.out.print(n+"\t");
}
System.out.println();
}
public static void main(String[]args) 
{
	m1(10);
	m2(10,30);
	m3(40,50,60);
	m3(60,70,80,90);
	m3 (100,200,300,400);
}
}
