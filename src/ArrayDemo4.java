//파라미터//  run ->run Configuration --> (tap)Arguments
public class ArrayDemo4 {
	public static void main(String[] array) {
		//java ArrayDemo4  45 + 78 <<45 , + , 78 이라는 배열이 만들어져서 String array에 들어갔다. cmd로 하였음
		//for(int i = 0; i <array.length; i++) {
			//System.out.println("array[" + "] = " + array[i]);
	//	}
		if(array.length != 3) {
			System.err.print("Usage Error");
			System.exit(-1); //exit 0이면 정상종료 -1이면 비정상 종료
		}
		
		int first = Integer.parseInt(array[0]); //"45" --> 45
		int second = Integer.parseInt(array[2]); // "78"--> 78
		switch(array[1]) {
		case "+" : System.out.printf("%d + %d = %d\n",first,second,(first + second)); break;
		case "-" :  System.out.printf("%d - %d = %d\n",first,second,(first - second)); break;
		case "x" :  System.out.printf("%d x %d = %d\n",first,second,(first * second)); break;
		case "/" :  System.out.printf("%d / %d = %d\n",first,second,(first / second)); break;
		case "%" : System.out.printf("%d %% %d = %d\n",first,second,(first % second)); break; //%%두번 쓰면 %사용가능
			default :  System.out.println("그런 연산자는 없습니다.");
		}
		
	}
}


