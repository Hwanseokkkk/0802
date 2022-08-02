//Call by Value 는 값이 바뀌지 않는다 (값 복사)
public class MethodDemo5 {
	public static void main(String[] args) {
		int original = 5;
		System.out.println("Before calling method, original = " + original);
		mymethod(original);
		System.out.println("After calling method, original = " + original);
	}
	static void mymethod(int target) { //int target = original
		System.out.println("in method, target = " + target);
		target = 100;
		System.out.println("in method, target = " + target);
		
		
	}
}
