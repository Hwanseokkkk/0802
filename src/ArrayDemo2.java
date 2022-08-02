import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		//층을 서로 바꾸어보자. (주소복사이기 때문에 가능하다)
		int [][] array = {
				{1,2,3,4,5},
				{10,9,8,7,6,5,4,3,2,1}
		};
		System.out.println("Before Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));
		
		int [] temp = array[0]; //임시변수 만들자
		array[0] = array[1];
		array[1] = temp;
		
		System.out.println("After Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));

		}
	}

