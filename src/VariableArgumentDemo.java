
public class VariableArgumentDemo { //Argument가 너무 많거나 가변적일때 ...사용
	public static void main(String[] args) {
		mymethod(1,2,3,4,5,6,7,8,6,4,5,3,5,45,3,1,2,4,5,6,4);  //넘어가는 변수를 Argument
	}
	static void mymethod(int ... array) {  //받는 변수를 Parameter
		
	}

}
//ar과 pa의 관계는 타입과 갯수가 같아야한다. 
