
public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Program is Strarting...");
		MethodDemo md = new MethodDemo();
		md.makeSum();  //Call(invoke)을 해야 일을 한다. md.makeSum();을 n번 call하면 n번 일을한다.
		md.makeSum();  
		System.out.println("Program is Over...");

	}
	
	void makeSum() { //Call by Name
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("Method is Over...");
	}
}
