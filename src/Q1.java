//성적관리프로그램
public class Q1 {
	public static void main(String[] args) {
		int [] answer = {1,2,3,4,1,2,3,4,1,2}; //정답 배열
		String[] names = { "한지민", "박지민", "홍지민", "신지민", "김지민" }; // 이름 배열
		int[][] array = { // 개인의 정답 배열
				{ 1, 2, 2, 4, 2, 2, 3, 4, 1, 2 },
				{ 1, 2, 3, 4, 1, 1, 1, 4, 1, 1 },
				{ 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 },
				{ 1, 3, 3, 3, 3, 3, 3, 3, 1, 2 },
				{ 1, 2, 3, 4, 1, 2, 3, 1, 1, 2 }
		};
		char[][] results = new char[names.length][10];
		int[] jumsus = new int[names.length];
		for (int i = 0; i < results.length; i++) {
			int jumsu = 0;
			for (int j = 0; j < results[i].length; j++) {
				if (array[i][j] == answer[j]) {
					results[i][j] = 'O';
					jumsu += 10;
				} else
					results[i][j] = 'X';
			}
			jumsus[i] = jumsu;
		}
		for (int i = 0; i < results.length; i++) {
			System.out.print(names[i] + " : ");
			for (int j = 0; j < results.length; j++) {
				System.out.printf("%c\t\t", results[i][j]);
			}
			System.out.println("(" + jumsus[i] + "점)");
		}
	}

}
