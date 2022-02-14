package day15;

import java.util.Scanner;

class Exscore {
	Scanner sc = new Scanner(System.in);

	int[] test1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	int test2(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	double test3(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

	int test4(int[] a) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 60) {
				cnt++;
			}
		}
		return cnt;
	}

	int test5(int[] a, int n) {
		return a[n];
	}

	int test6(int[] a, int n) {
		n = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				idx = i;
			}
		}
		return idx;
	}

	int test7(int[] a, int[] b, int n) {
		n = sc.nextInt();
		int s = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				s = b[i];
			}
		}
		return s;
	}
}

public class School {
	public static void main(String[] args) {
		Exscore e = new Exscore();
		int[] ids = { 1001, 1002, 1003, 1004, 1005 };
		int[] score = new int[5];

		System.out.print("�л����� ����: ");
		e.test1(score);

		int total = e.test2(score);
		System.out.println("������ ����: " + total);

		double avg = e.test3(score);
		System.out.println("������ ���: " + avg);

		int cnt = e.test4(score);
		System.out.println("������ 60�� �̻� ��ݻ� ��: " + cnt);

		int s = e.test5(score, 1);
		System.out.println("�ε����� ���޹޾� ���� ����: " + s);

		int idx = e.test6(score, s);
		if (idx == -1) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		} else {
			System.out.println("������ ���޹޾� �ε��� ����: " + idx);
		}

		s = e.test7(ids, score, 1000);
		if (s == -1) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�й��� ���޹޾� ���� ����: " + s);
		}
	}
}
