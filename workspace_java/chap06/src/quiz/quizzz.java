package quiz;

import java.io.IOException;

public class quizzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(344564);
		System.out.println(341231321);
		
		System.out.printf("이 름: %s", "김 자 바 ");
		System.out.println();
		
		System.out.printf( " 이름 : %6s, 나이 : %04d", "김자바", 25);
		
	
	//	System.out.printf("이름 : " +name + ", 나이 : "+ age);
	//입력
		int keyCode;
		
		try {
			keyCode = System.in.read();
			System.out.println("keycode: " + keyCode);
			
			keyCode = System.in.read();
			System.out.println("keycode: " + keyCode);
			
			keyCode = System.in.read();
			System.out.println("keycode: " + keyCode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
