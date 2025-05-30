package sec02.exam02;

public class Opexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int x = 10;
	      int y = 10;
	      
	      x++;
	      System.out.println("x: "+x);
	      ++x;
	      System.out.println("x: "+ x);

	      x = 10;
	      x = x + 1;
	      x += 1; // 위와 같은 코드
	      x++;    //위와 같은 코드
	               // 단, 1을 증가할때만
	      
	      x = 10;
	      int z = ++x;
	      System.out.println("z: "+z);
	      
	      x=10;
	      z= x++;
	      System.out.println("z "+ z);
	      System.out.println("x: "+x);
	      
	      x= 10;
	      System.out.println("++x : "+ ++x);   
	      x= 10;
	      System.out.println("x++ : "+ x++);
	      
	      x = 1;
	      // 1 + 3
	      z = x++ + ++x;
	      System.out.println("z: "+ z);
	      System.out.println("x: "+ x);
	      
	      x = 1;
	      z = x++ - --x * x++ - x--;
	      // x와 z의 값은?
	      System.out.println("x: "+ x +", z: "+z);
	      System.out.printf("x: %d, z: %d", x, z);
	      System.out.println();
	      
	      boolean a = false;
	      a = !a;
	      System.out.println("a : "+ a);
	      
	      int b = 10;
	      //    int c = b / 0;
	      // 나누기 할 때 0으로 나누지 않도록 조심
	      double d = 7.3;
	      double e = d / 0;

	      
	      
	     System.out.println(0.1 == 0.1f);
	     // 소수점을 비교할 때는 같은 타입으로 변환해서 비교하자
	     
	     String s1 = "s1";
	     String s2 = "s1";
	     System.out.println(s1.equals(s2));
	     
	     //퀴즈
	     //난 돈이 10000원 있습니다
	     //1. 4500원 짜리 프라프치노를 최대 몇 잔 살 수 있나요?
	     //2. 그리고 남은 돈 
	     int money = 10000;
	     int coffee = 4500;
	     int count = money / coffee;
	     System.out.println("총 "+ count + "잔" );
	     int change = money % coffee;
	     System.out.println("잔 액: "+ change );
	
	     //
	     int score = 87;
	     System.out.println("내 점수는 80과 90사이다 참? 거짓?");
	     //true / false 출력
	     System.out.println( score >= 80 && score <= 90 );
         
	     // v1 / v2  소수점 3자리까지 출력하시오
	     //오직 사칙연산으로만 해결하세요 

	    
	     
	     double random1 = Math.random();
	     System.out.println(random1);
	     
	     // 로또 번호 : 1~45 >>> 0~~~44 +1
	     int lotto1 = (int)(Math.random()*45) + 1; // 1~45
	     System.out.println( "lotto1: " + lotto1);
	     
	     int num = 1;
	     if( num == 1 ) {
	    	 System.out.println("num은 1입니다");
	     } else if( num == 2 ) {
	    	 System.out.println("num은 2입니다");
	     } else {
	    	 System.out.println("num은 1과 2가 아닙니다");
	    	  }
     //char,byte,short,int, string
	 // 사용못함 boolean, long, float, double
	     switch(num) {
	          case 1:
	        	  System.out.println("switch num은 1입니다");
	 //       	  break;
	          case 2:
	        	  System.out.println("switch num은 2입니다");
	        	  break;
	        	  default :
	        		  System.out.println("switch num은 1과 2가 아닙니다");
	        		  break;
	     }
	     // 봄 : 3,4,5 여름 : 6,7,8 가을:9,10,11 겨울:12,1,2
	     int month = 1;
	     /*
	     문제 1.,
	     int 변수에 임의의 수를 넣고
	     그 수가 "양수", "0", "음수" 구분하여 출력

	     문제 2.,
	     a와 b 두 수 중에서 큰 값을 출력

	     문제 3.,
	     시간 과 분이 있을 때
	     35분이 지난 시간을 출력

	     문제 4.,
	     어떤 수가
	     15와 20 사이(포함)에 있는가?

	     문제 5.,
	     통장 잔액이 10000원 있을 때
	     출금액에 따라
	     "잔액이 부족합니다", "얼마 출금 했고 얼마 남았습니다", "정확히 입력 해주세요"

	     문제 6.,
	     값에 따라(예를 들어 125)(단, 0은 양수+짝수)
	     "100 보다 큰 수이며, 양수이고, 홀수입니다"
	     예를들어 -6
	     "100 보다 작은 수이며, 음수이고, 짝수입니다"

	     문제 7.,
	     어제 온도, 오늘 온도 변수 두개
	     2, -3
	     "오늘 온도는 영하 3도 입니다. 어제보다 5도 낮습니다" 

	     문제 8번.,
	     변수에 두자리 숫자(10~99)가 있을 때
	     10의 자리와 1의 자리가 같은 수인지 판단

	     문제 9번.,
	     사각형의 한쪽 모서리 x1:10, y1:20
	     대각선 모서리       x2:90, y2:100
	     이럴 때 새로운 점 x3, y3는 사각형에 포함되는가?
	   */
	   
	     
	     
	     
	     
	     
	     	
	     
	     
	     
	     
	     
	 
	      
	      
	}

}
