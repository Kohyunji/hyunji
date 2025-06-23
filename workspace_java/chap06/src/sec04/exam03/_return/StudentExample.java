package sec04.exam03._return;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메소드
		//메소드를 통해서
		// 이름과 나이를 전달해서 저장하기
		//이름과 나이를 돌려받아서 출력하기
		
		Student s1 = new Student ();
		s1.name= "고현지";
		s1.age=29;
		System.out.println("이름 :" + s1.name);
		
		Student s2 = new Student ();
		s2.name= "김상명";
		System.out.println("이름: " + s2.name);
		
		
	}

}
