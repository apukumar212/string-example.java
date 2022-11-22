package com.task1;

public class ClassE 
{
public String testmethod()
{
	System.out.println(35);
	return new ClassE().testmethod3(new ClassE().testmethod2())+ new ClassE().testmethod4("here");
}
public int testmethod2()
{
	System.out.println(25);
	return 25+5;
}
public String testmethod3(int a)
{
	System.out.println(15);
	return " is ";
}
public String testmethod4(String s)
{
	System.out.println(45);
	return "awesome";
}
public static void main(String[] args) 
{
	ClassE t=new ClassE();
	System.out.println("java"+t.testmethod());
}
}

