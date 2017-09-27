package test2;

import java.util.Scanner;

public class work1 {
	public static void Addtest() {
		int i=0;
		for(i=0;i<10;i++) {
			System.out.println((int)(Math.random()*100)+"+"+(int)(Math.random()*100)+"=");
		}
		
	}
	public static void subtest() {
		int i=0;
		for(i=0;i<10;i++) {
			System.out.println((int)(Math.random()*100)+"-"+(int)(Math.random()*100)+"=");
	}

	}
	public static void mulltest() {
		int i=0;
		for(i=0;i<10;i++) {
			System.out.println((int)(Math.random()*100)+"*"+(int)(Math.random()*100)+"=");
	}
	}
	public static void intotest() {
		int i=0;
		for(i=0;i<10;i++) {
			System.out.println((int)(Math.random()*100)+"/"+(int)(Math.random()*100)+"=");
			}
	}
	public static void main(String[] args) {
		System.out.println("输入你想进行的练习，加法请按1，减法请按2，乘法请按3，除法请按4");
		Scanner scan = new Scanner(System.in);
		int i;
		i=scan.nextInt();
		switch (i) {
		case 1:
			Addtest();
			break;
		case 2:
			subtest();
			break;
		case 3:
			mulltest();
			break;
		case 4:
			intotest();
			break;

		default:
			System.out.println("没有这个选项！");
			break;
		}
	}
	}
