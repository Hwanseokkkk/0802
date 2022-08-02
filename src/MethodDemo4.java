
public class MethodDemo4 {
	public static void main(String[] args) {
		//mymethod(5,  62.8,  'A',  "Hello, World");
		//mymethod(new int[] {3,4,5,6});
		Student jimin = new Student(); jimin.name = "한지민";  jimin.age = 26;
		mymethod(jimin);
	}
	static void mymethod(Student mystudent) { //Call by Reference
	//static void mymethod(int [] array) { //Call by Reference (주소)
	//static void mymethod(int su,  double weight,   char grade,   String str) { //개수와 타입을 비교해서 호출해야한다. Call by Value 
		
	}

}
