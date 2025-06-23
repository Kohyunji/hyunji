package sec02.exam02; 

public class Forexam {
	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 = sum1 + 1;
			System.out.println("1~10의 합 : " + sum1);
		}

// 2~10까지 짝수만 출력
		int i2 =0;
		for (int i3 = 2; i3 <= 10; i3++) {
			i2 = i2 + i3;
		}

// 다시 쓰면
System.out.println(2);
System.out.println(4);
System.out.println(6);

// 이번엔 변수를 활용해서 다시 쓰기
int i3 = 2;

System.out.println(i3);

i3 = i3 + 2;
for(int i4 =2; i4 <=10; i4 += 2)
	System.out.println(i4);


//2. 10~1 출력
//3. 1~10까지 다음과 같이 출력
//        1: 홀수
//        2. 짝수
// 4. 구구단 2단 출력
// 5. 1~10까지  3개씩 옆으로 찍기
// 6. 1부터 100까지 홀수의 개수

int a =10;
//b=b-10;
for(int b =10;  b>=1; b -=1)
        System.out.println(b);

//3. 1~10까지 다음과 같이 출력
//           1. 짝수
//
int w = 0;
for(int h=0; h<=10; h+=2)
	System.out.println(h);


//           2. 홀수
int R = 0;
for(int x=1; x<=10; x+=2) {
	System.out.println(x);
}
 // 9. 두~세단씩 옆으로 출력
///////////////////////////////////////////
//0단계
/*
+
+
+
+
+
*/
	System.out.println("+");
	System.out.println("+");
	System.out.println("+");
	System.out.println("+");
	System.out.println("+");
	

	
	
//1단계
	/*
	+++++
	/*
    
	 */
	
for(int j=1; j<=6; j++)  {
	System.out.print("+");
	
}


//2단계
String space = ".";
/*
 * +.+.+.+.+.
 */
//for(int j=1; j<=5; j++)  {
//	System.out.println("mark");
//	System.out.println("space");
//		System.out.println();
		//3단계
		/*
		  +++++
		  +++++
		  +++++
		 */
		//4단계
		/*
		 1
		 22
		 333
	 	4444
	 	55555
		 */

		//문제 1
		//주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력
		//[1,1][1,2]

		//문제 2
		//주사위 2개의 합 별로 나올 수 있는 조합
		//합 2 : [1,1]
		//합 3 : [1,2] [2,1]

		//문제 3
		// 합 별 조합의 수 출력

		// 문제 4
		// 순서에 관계 없이 중복 제거
		//합2  : [1,1]
		//합3 : [1,2]와 [2,1]은 같음


	
		
		int i = 1;
		while(i <=10) {
			System.out.println(i);
		i++;
		}
	
	
	
	}
	
	
}




