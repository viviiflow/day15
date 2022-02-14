package day15;

class Ex05 {
	int cnt = 0;

	int test1(int[] arr) {

		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	int[] test2(int[] arr) {
		int[] temp = new int[cnt];
		cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				temp[cnt] = arr[i];
				cnt++;
			}
		}
		return temp;
	}

	void print(int[] temp) {
		for (int i = 0; i < cnt; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}

public class method {
	public static void main(String[] args) {
		Ex05 e = new Ex05();
		int[] arr = { 87, 12, 21, 56, 100 };
		System.out.println("4의 배수의 갯수: " + e.test1(arr));
		int[] temp = e.test2(arr);
		System.out.print("4의 배수만 배열 타입으로 리턴: ");
		e.print(temp);
	}
}
