//Swapping (Call by Value)
public class MethodDemo6 {
	public static void main(String[] args) {
		int a = 5, b = 9;
		System.out.println("Before swap : a = " + a + ", b = " + b);
		swap(a, b);
		System.out.println("After swap : a = " + a + ", b = " + b);
	}
	static void swap(int c, int d) {
		System.out.println("In mehod, before swap : c = " + c + ", d = " + d);
		int temp = c;
		c =d;
		d = temp;
		System.out.println("In mehod, after swap : c = " + c + ", d = " + d);
	}

}
