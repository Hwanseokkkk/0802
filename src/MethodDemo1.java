
public class MethodDemo1 {
	public static void main(String[] args) {
		System.out.println("Program is Strarting...");
		MethodDemo1 md = new MethodDemo1();
		md.makeSum(2, 300);  //Call(invoke)을 해야 일을 한다. md.makeSum();을 n번 call하면 n번 일을한다.
		md.makeSum(30, 50);  
		System.out.println("Program is Over...");

	}
	
	void makeSum(int start, int last) { //Call by Value 값을 이용한 Call
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println(start +"부터 " + last + "까지의 합 = " + sum);
		System.out.println("Method is Over...");
	}
}
