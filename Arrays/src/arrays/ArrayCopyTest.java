package arrays;

public class ArrayCopyTest {

	public static int[] incrementar(int[] array_a) {
		int[] b = new int[array_a.length + 1];
		System.arraycopy(array_a, 0, b, 0, array_a.length);
		return b;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		a = incrementar(a);
		a[a.length - 1] = 60;
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
	}

}
