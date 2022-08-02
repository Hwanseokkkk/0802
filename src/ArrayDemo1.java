
public class ArrayDemo1 {
	public static void main(String[] args) {
		//<<Rectangular Array>>
		//첫번째 방법
//		int [][] array; //2차원배열 선언.
//		array = new int[2][3]; //2차원배열 생성.
//		array[0][0] = (int)(Math.random()*10+1); //할당
//		array[0][1] = (int)(Math.random()*10+1);
//		array[0][2] = (int)(Math.random()*10+1);
//		array[0][3] = (int)(Math.random()*10+1);
//		array[1][1] = (int)(Math.random()*10+1);
//		array[1][2] = (int)(Math.random()*10+1);
		//두번째 방법
//		int [][] array; //선언
//		array = new int[][] { new int[] {3,4,5,6},{7,8,9,10}}; //생성과 할당
		//세번쨰 방법
//		int [][] array = { //초기화
//				{1,2,3,4}, 
//				{5,6,7,8},
//				{9,10,11,12}
//				};
		//<Ragged(Jagged) Array>> 각층의 열의 개수가 다를 수 있다.
		//첫번째 방법
//		int [][] array; //선언
//		array = new int[3][]; //생성 (3행인데 열은 몰라~)
//		array[0] = new int[3];
//		array[1] = new int[2];
//		array[2] = new int[1];
//		array[0][0] = (int)(Math.random()*10+1); //할당
//		array[0][1] = (int)(Math.random()*10+1);
//		array[0][2] = (int)(Math.random()*10+1);
//		array[1][0] = (int)(Math.random()*10+1);
//		array[1][1] = (int)(Math.random()*10+1);
//		array[2][1] = (int)(Math.random()*10+1);
		//두번째 방법
//		int [][] array; //선언
//		array = new int[3][]; //생성 및 할당
//		array[0]  = new int[] {3,4,5,6,7,8};
//		array[1]  = new int[] {9,10};
//		array[2]  = new int[] {11,12,13};
		//세번째 방법
		int [][] array = { //array는 행에 대한 정보를 가지고있다.
				{3,4,5,6},
				{7,8},
				{9,10,11,12,13,14}
		        };
		
		for(int i=0; i < array.length; i++) { //array.length 행의 개수
			System.out.println("array" + i + "층");
			for(int j = 0 ; j < array[i].length; j++) {//array[i].length 각층의 열의 개수
				System.out.print("array[" + i + "][" + j + "] = " + array[i][j] + "\t");
			}
			System.out.println();
		}
		}
	}


