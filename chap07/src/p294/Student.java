package p294;

public class Student extends People{
	public int studentNo;
	
	//생성자 super = 부모의 기본 생성자를 부를 때 [People]
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

}
