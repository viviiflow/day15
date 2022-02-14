package day15;

class Return {
	int result = 0;

	int plus(int n, int m) {
		result = n + m;
		return result;
	}

	int rePlus(int n, int m) {
		return n + m;
	}

	int plus_1(int n, int m) {
		return n + m;
	}

	int[] array = new int[4];

	void copyArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			array[i] = arr[i];
		}
	}

	int[] reArr() {
		int[] temp = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		return temp;
	}

}

public class returnEx {
	public static void main(String[] args) {
		Return r = new Return();
		r.plus(10, 3);
		System.out.println("두 수의 합: " + r.result);

		int result = r.rePlus(10, 3);
		System.out.println("두 수의 합: " + result);

		result = r.plus_1(10, 3);
		System.out.println("두 수의 합: " + result);

		System.out.println("=======================");
		int[] arr = { 10, 20, 30, 40 };
		r.copyArr(arr);
		System.out.println("배열: ");
		for (int i = 0; i < r.array.length; i++) {
			System.out.print(r.array[i] + " ");
		}
		System.out.println();

		arr = r.reArr();
		System.out.println("배열: ");
		for (int i = 0; i < r.array.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
