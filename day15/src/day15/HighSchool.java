package day15;

import java.util.Scanner;

class Student {
	Scanner sc = new Scanner(System.in);
	String name = "";
	int[] std = { 1001, 1002, 1003, 1004, 1005 };
	int[] score = { 92, 38, 87, 100, 11 };

	void choice1() {
		System.out.print("전교생 성적: ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
	}

	void choice2() {
		int max = 0;
		System.out.print("성적이 가장 높은 학생: ");
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		System.out.println(max);
	}

	void choice3() {
		int min = 10000;
		System.out.print("성적이 가장 높은 학생: ");
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.println(min);
	}

	void choice4() {
		System.out.print("학번을 입력하세요 : ");
		int n = sc.nextInt();
		int idx = -1;
		try {
			for (int i = 0; i < std.length; i++) {
				if (n == std[i]) {
					idx = i;
				}
			}
			System.out.println(std[idx] + " 학생의 성적은 " + score[idx] + "점입니다.");
		} catch (Exception e) {
			System.out.println("해당 학생의 성적은 존재하지 않습니다.");
		}
	}

}

public class HighSchool {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student mega = new Student();
		mega.name = "학생성적 관리 프로그램";
		while (true) {
			System.out.println("=== " + mega.name + " ===");
			System.out.println("1. 전교생 성적확인");
			System.out.println("2. 1등학생 성적확인");
			System.out.println("3. 꼴등학생 성적확인");
			System.out.println("4. (학번을 입력받아)성적확인하기");
			System.out.println("5. 종료하기");
			System.out.print("메뉴 선택 : ");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
