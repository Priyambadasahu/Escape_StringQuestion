package com.kodnest;

import java.util.Scanner;

public class Hy
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("😁 Hy if you are free, can we meet on this weekend??");
		System.out.println("-->>yes || no<<--");
		String a =s.nextLine();
		String c="Okay no worries Next Time!!!";
		if(a.equals("yes"))
		{
			System.out.println("Okay lets catch up!!");
		}
		else if(a.equals("no")) {
			System.out.println(c+"😁");
		}
	}
}

