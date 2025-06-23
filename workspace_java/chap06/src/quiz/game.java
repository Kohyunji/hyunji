package quiz;

public class game {
		{
		// TODO Auto-generated method stub
//		0-9까지 중에서
//		찍어보자 : 4
//		>> up - 시도 1
//		찍어보자 : 8
//		>> down - 시도2
//		찍어보자 : 6
//		>>정답 - 시도3
			
			
	//랜덤 숫자를 생성해서 돌려주기
	int getNumber(int start, int end) {
		int result = Integer. MIN_VALUE;
		if(end>=start) {
		int result = Math.random( ) * (end-start+1)) + start;
		return result;
		}
		
//		계산기
// 첫번째 수 입력 : 3엔터
// 연산자 입력 값 : +엔터
// 두번째 수 입력 : 5엔터
// 결과 : 3+5=8

	}

}
