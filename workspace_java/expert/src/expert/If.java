package expert;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 400000;
		System.out.println(money);
		
		boolean 회go = money > 60000;
		System.out.println("회go: " + 회go);
		
		boolean 닭발go = money < 60000;

//		if(회go){
//			System.out.println("회");
//		}
//		if(money > 60000){
//			System.out.println("회");
//			
//		}
		
		
//		
//		if(닭발go){
//			System.out.println("닭발");
//		}
//		if(money<60000){
//			System.out.println("닭발");
//		}
		
		if(money > 60000){
			System.out.println("회");
		} else {
			System.out.println("닭발");
		} 
		
		if(money > 60000){
			System.out.println("회");
		} 
		if (money>30000) {
			System.out.println("닭발");
		} else {
			System.out.println("엽떡");
		}
	
		int month = 1;
		if (month >=6 &&  month<=8) {
			System.out.println("여름");
		}
		else if (month>=9&& month<=11) {
			System.out.println("가을");
			}
		else if (month>=3 && month<=5) {
			System.out.println("봄");
		} else if (month ==12 || month<=2){
			System.out.println("겨울");
		}
		
		int x = -3;
				if( x>0) {
					System.out.println("양수");
				}
				else if (x == 0)
					System.out.println("0");
				else if(x<0)
					System.out.println("음수");

		
		int a=10;
		int b=20;
		if(a>b) {
		System.out.println("a");
		}
		else if(a<b) {
		System.out.println("b");
		} else {
			System.out.println("a랑 b랑 같습니다");
		}
		
		int hour = 4;
		int minute = 45;
		System.out.println(hour+"시"+(minute+35)+"분" );
		int afterMinute=minute+35;
		 if (afterMinute >=60  ) {
			 hour++;
			 minute = afterMinute-60;
			 }
		 else { 
			 minute= afterMinute;
			 }
		 System.out.println(hour + "시" + minute+ "분");
	
	
	
	

		 
		 int hourr = 4;
		int minuteu = 50;
		int blacks;
//		분에다가 45를 더한 값에서 60을 뺀 값
		
		int afterMinutes = minuteu+45;
		if  (afterMinutes>=60) { //if (해당되는 조건) {실행되는 문장}
			hourr++;
			 blacks = afterMinutes- 60 ;
			 
		}
		else {blacks= afterMinutes;
//else { if 조건에 해당하지 않는 모든 것들 실행한다}
		}
	System.out.println(hourr + "시" +blacks+ "분");
	System.out.println(blacks);
		
				
				
				
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		//
		
//		if (hour >6);{
//			System.out.println("8");
//			else if(minute>54);{
//			System.out.println("55");
//		
//		}
		
		
		

			
	}

}
