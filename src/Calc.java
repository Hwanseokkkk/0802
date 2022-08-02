
public class Calc {
	static void calc(Student student) {//이지역에서은 jimin이 student
		student.tot = student.kor + student.eng + student.mat;
		student.avg = student.tot / 3.;
		student.grade = (student.avg <= 100 && student.avg >= 90) ? 'A' : //3항 연산
			(student.avg <90 && student.avg >=80) ? 'B' : 
				(student.avg <80 && student.avg >=70) ? 'C' : 
					(student.avg <70) ? 'D' : 'F';
		
	}
}
