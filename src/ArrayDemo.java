import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = { 4,8,9,10,2,4,6,1,3,2,5,89,87,45,32,12};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);  //오름차순API
		System.out.println("After AscdingSorting"); 
		System.out.println(Arrays.toString(array));
		
		System.out.println("After DescdingSorting"); //내림차순은 API가 없음
		System.out.print("[");
		for(int i = array.length -1; i >=0;  i--) {
			System.out.print(array[i] + ",");
	}
		System.out.println("]");
	}
}