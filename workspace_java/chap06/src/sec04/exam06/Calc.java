package sec04.exam06;

public class Calc {

	
	int plus(int a, int b) {
		return a + b;
	}
	// 전달인자가 int, int로 같기 때문에 오버로딩 적용 안됨
	//int plus(int a, int b) {
	// return a + b;
	// }
	
		double plus(double a, double b) {
	System.out.println("더블더블 실행");
			return a + b;
		}
	}

