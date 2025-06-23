package sec05.exam05_final;

public class person {

		final String nation = "Korea";
		final String ssn;
		String name;
		
		
		//final
		//값이 할당된 경우 변경할 수 없게 막아줌
		
		Person(){
			//final의 값이 없던 경우
			//생성자에서 딲 한번 할당할 수 있다
			this.ssn = "주민번호";
			this.name = "이름";
		//	this.nation = "다른나라"; 	//바뀌지 못하게 막혔음
			
			
			this.name = "이름2";	
	//		this.ssn = "주민번호2";
			
		}
		}
}
