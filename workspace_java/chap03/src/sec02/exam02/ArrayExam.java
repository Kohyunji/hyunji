package sec02.exam02;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *
		 *
		 */
		
		//선언
		int[] a1; 		//java  스타일
//		int[] a;
		int a2[]; 		// c 스타일
				
		a1 = null;
		
		
		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 75;
		
		int[] score = new int[3];
		score[0] = 90;
		score[1] = 80;
		score[2] = 75;
		System.out.println("score[1] : "+ score[1]);
		
		String[] str = new String[3];
		System.out.println("str[0] : "+ str[0] ) ;
		
		
		int[] d1 = {1,2,3,4,5};
		int[] d2 = d1;
		int[] d3= {1,2,3,4,5};
		System.out.println("d1 == d2 : " + ( d1 == d2));
		System.out.println("d1 == d3 : " + (d1 == d3));
		
		d2[1] = 10;
		System.out.println("d1[1] : "+ d1[1]);
		
		int [] f = {4,5,7,2,6,9 };
		
//		문제 0,
//	배열 깊은 복사 : {1,2,3} -> {1,2,3}
	
		

//문제1,
//배열 뒤집기 : {1,2,3} -> {3,2,1}
		
		
		

		
//여기서 = {3,4,7,5,1,9,4}

//문제2,
//여기서 홀수의 개수 찾기
		

//문제3,
//여기서 4보다 큰 수의 개수 구하기

//문제4,
//여기서 최대값을 출력하시오

//문제5,
//여기서 두번째 큰 수 구하기

//문제6,
//오른쪽으로 한칸 밀기(왼쪽은 0으로 채우기)
//예시 : {3,4,7,5,1,9,4} -> {0,3,4,7,5,1,9,4}

//문제7,
//오른쪽이 이동 하는데 맨 끝에 값을 맨 처음으로 보내기
//{3,4,7,5,1,9,4} -> {4,3,4,7,5,1,9}

//문제8,
//임시비밀번호 8자리 생성
 //  + 8-1 : 숫자만
//   + 8-2 : 소문자만
 //   + 8-3 : 숫자2개 이상, 대/소문자 각 1개 이상

//문제9,
//자리가 10개 있는 소극장의 예약 시스템
//자리 번호는 1~10번까지 번호의 자리가 있습니다.
//메뉴 : "1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료"
//만약1 : 예약이 가능하다면 "n번 자리 예약 했습니다"
//만약2 : 예약이 불가능하다면 "이미 예약 되어 있습니다"

//문제10,
//로또 6개 생성. 단, 중복 없이
		
		//1. 로또 번호 하나 뽑기
		//2. 중복 체크
	    int[] lotto = new int[6];
        boolean flag = false;
        for(int i=0; i<lotto.length; i++) {
            do {
                flag = false;
                lotto[i] = (int)(Math.random()*45) + 1;
                for(int j=0; j < i; j++) {
                    if(lotto[j] == lotto[i]) {
                        System.out.println("중복:"+ lotto[i]);
                        flag = true;
                    }
                }
            } while( flag );
        }
        for(int i=0; i<lotto.length; i++) {
            System.out.print(lotto[i]+ ", ");
        }
        System.out.println();
		
		
	}

}
