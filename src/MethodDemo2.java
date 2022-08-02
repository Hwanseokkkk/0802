//return 값은 메인으로 넘어오면 result로 받아주어야한다.
public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Program is Strarting...");
		MethodDemo2 md = new MethodDemo2();
		
		int start = 1, last = 100;	
		int result = md.makeSum(start, last); //변수이름이 같지만 지역변수라서 상관없다.
		System.out.println(start +"부터 " + last + "까지의 합 = " + result);
		
		start = 30;
		last = 50;
		result = md.makeSum(start, last);
		System.out.println(start +"부터 " + last + "까지의 합 = " + result);
		System.out.println("Program is Over...");
	}
	
	
	
	int makeSum(int start, int last) {
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println("Method is Over...");
		return sum; //void는 아무것도 들고 돌아가지 않겠다라는 뜻임으로 void를 Type에 맞추어 바꾸어주면 된다.
	}
	
	
	
}
