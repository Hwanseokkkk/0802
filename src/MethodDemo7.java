
//성적 관리 프로그램
public class MethodDemo7 {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student jimin = new Student();
		Input.input(jimin);
		Calc.calc(jimin);
		Output.output(jimin);
		System.out.println("성적관리프로그램 끝");
	}
	
	}

