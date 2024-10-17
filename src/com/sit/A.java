package com.sit;
import java.util.Scanner;
public class A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true)
	{
	System.out.println("1. Enter Your Rollno");
	System.out.println("2.Enter Your Name: ");
	System.out.println("3.Enter Your Email");
	int choice=sc.nextInt();
		switch(choice){
		case 1:	
			int rollno=	sc.nextInt();
			System.out.println(rollno);
			break;
		case 2:
			String name = sc.next();
			System.out.println(name);
			break;
		case 3:
			String email = sc.next();
			System.out.println(email);
		break;
		default:
			System.out.println("Invalid Choice...!");
			System.exit(0);
		}
	}
	
}
}
