package sec01.exam01;

public class studentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student( );
		
		Student s2 = new Student( );
		
		System.out.println(s1 == s2);    //false
		
		Student s3 = null;
		s3 = s1;
	
		System.out.println(s1 == s3);		//true
		
		s1 = null;
		s3= null;
		System.out.println(s1 == s3);
		
		System.out.println(s2);
	
	}

}
