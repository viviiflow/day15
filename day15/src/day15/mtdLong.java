package day15;

class ExLong {
	long add(long n, long m) {
		System.out.println(n+" + "+m+" = "+(n+m));
		return n;
	}

	long sub(long n, long m) {
		System.out.println(n+" - "+m+" = "+(n-m));
		return n;
	}
	long mul(long n, long m) {
		System.out.println(n+" * "+m+" = "+(n*m));
		return n;
	}
	long div(long n, long m) {
		System.out.println(n+" / "+m+" = "+(n/m));
		return n;
	}
}

public class mtdLong {
	public static void main(String[] args) {
		ExLong e = new ExLong();
		long r1 = e.add(5L, 3L);
		long r2 = e.sub(5L, 3L);
		long r3 = e.mul(5L, 3L);
		double r4 = e.div(5L, 3L);

	}
}
