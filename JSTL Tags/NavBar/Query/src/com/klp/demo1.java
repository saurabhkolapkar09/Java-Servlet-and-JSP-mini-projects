package com.klp;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int a;a<=b;a++)
		{
			if(a%2!=0)
			{
				System.out.print(a+" ");
			}
		}

	}

}
