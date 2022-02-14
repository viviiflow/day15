package day15;

class NumEx {
	int test1(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	int test2(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	int test3(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	int test4(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}

public class numMethod {
	public static void main(String[] args) {
		NumEx e = new NumEx();
		int[] arr = { 87, 100, 11, 72, 92 };

		int total = e.test1(arr);
		System.out.println("전체 합 리턴: " + total);
		
		total = e.test2(arr);
		System.out.println("4의 배수 합 리턴: " + total);
		
		int cnt = e.test3(arr);
		System.out.println("4의 배수 개수 리턴: " + cnt);
		
		cnt = e.test4(arr);
		System.out.println("짝수의 개수 리턴: " + cnt);
	}
}
