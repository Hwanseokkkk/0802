import java.util.Arrays;

//주의할 점.
public class ArrayDemo3 {
	public static void main(String[] args) {
//		String [] array = {"Hello","World","한지민"};
//		for(int i = 0; i < array.length; i++) {  //방은 3개인데 5번 돌아라 -->오류가 발생한다.(**항상 length를 사용하자**)
//			System.out.println(array[i]);
//		}
		
		//Array Resizing ***배열은 Resizing 되지않는다***
		/*int [] array = {1,2}; //java의 배열은 늘어나지 않는다 2번째 방이없기 때문에 3을 넣을 수가 없다.
		array[2] = 3;*/
		//----해결방안----
		//주소를 새로받자
//		int [] array = {1,2};
//		array = new int[3]; //<<<<주소를 새로 받자
//		array[2] = 3;
		
		//Copying Arrays (배열의 복사)
		//주소복사는 상관없지만 값 복사는 개수를 맞춰야한다.
		
		int [] original = {1,2,3,4,5};
		int [] target = {10,9,8,7,6,5,4,3,2,1};
//		System.arraycopy(original, 2, target, 0, 3); //original의 3,4,5 를 10,9,8 에 덮어쓰기
//		System.out.println(Arrays.toString(target));
//		original[2] = 100;
//		System.out.println(Arrays.toString(target));
		System.arraycopy(original, 0, target, 9, 5); //original의 1,2,3,4,5를 target의 9번째인 1에 덮어씌워라 이지만 방의 개수가 모자라서 오류가 발생함
		
	}
}
