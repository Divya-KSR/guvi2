import java.io.*;
import java.util.*;
import java.util.Scanner;
class Fact1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=1,i;
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
            
        }
        System.out.println(fact);
    }
}
