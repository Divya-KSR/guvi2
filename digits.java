import java.util.*;
import java.lang.*;
import java.io.*;


class Digits
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev=new StringBuffer(str).reverse().toString();
		System.out.println(rev);
	}
}
