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
		System.out.println("����������е���ϰ���ӷ��밴1�������밴2���˷��밴3�������밴4");
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
			System.out.println("û�����ѡ�");
			break;
		}
	}
	}
