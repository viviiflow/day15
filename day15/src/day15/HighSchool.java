package day15;

import java.util.Scanner;

class Student {
	Scanner sc = new Scanner(System.in);
	String name = "";
	int[] std = { 1001, 1002, 1003, 1004, 1005 };
	int[] score = { 92, 38, 87, 100, 11 };

	void choice1() {
		System.out.print("������ ����: ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
	}

	void choice2() {
		int max = 0;
		System.out.print("������ ���� ���� �л�: ");
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		System.out.println(max);
	}

	void choice3() {
		int min = 10000;
		System.out.print("������ ���� ���� �л�: ");
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.println(min);
	}

	void choice4() {
		System.out.print("�й��� �Է��ϼ��� : ");
		int n = sc.nextInt();
		int idx = -1;
		try {
			for (int i = 0; i < std.length; i++) {
				if (n == std[i]) {
					idx = i;
				}
			}
			System.out.println(std[idx] + " �л��� ������ " + score[idx] + "���Դϴ�.");
		} catch (Exception e) {
			System.out.println("�ش� �л��� ������ �������� �ʽ��ϴ�.");
		}
	}

}

public class HighSchool {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student mega = new Student();
		mega.name = "�л����� ���� ���α׷�";
		while (true) {
			System.out.println("=== " + mega.name + " ===");
			System.out.println("1. ������ ����Ȯ��");
			System.out.println("2. 1���л� ����Ȯ��");
			System.out.println("3. �õ��л� ����Ȯ��");
			System.out.println("4. (�й��� �Է¹޾�)����Ȯ���ϱ�");
			System.out.println("5. �����ϱ�");
			System.out.print("�޴� ���� : ");
			int slt = sc.nextInt();

			if (slt == 1) {
				mega.choice1();
			}
			if (slt == 2) {
				mega.choice2();
			}
			if (slt == 3) {
				mega.choice3();
			}
			if (slt == 4) {
				mega.choice4();
			}
			if (slt == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}
