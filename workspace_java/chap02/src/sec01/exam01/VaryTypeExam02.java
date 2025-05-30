package sec01.exam01;

public class VaryTypeExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 카멜케이스  camel case
//	
		
		double d = -3.14;
		int i = (int)  d;
        System.out.println("i: "+ i );
        
        int i2 = 100;
        long l1 = (long )i2;
        long l2 = i2;
    
        int i3 = 3;
        long l3 = 4L;
        long l4 = i3 + l3;
        // I3 + l3;
        
        int i7 = 10;
        double d7 = 5.5;
        double d8 = i7 + d7;
        System.out.println("d8: "+ d8);
        
      //퀴즈
      //회식비 4.3원
      //참석인원 4명
       // 이  때 인당 얼마 내야 하는가?
      //1. 디테일하게 원단위까지
       //2. 참석인원은 만원단위로만 회식비를 낸다
        //3. 2 번처럼 받으면 주최자는 얼마를 내야 하나?
	
      Double total = 4.3;
      int count = 4;
   //   double result1 = total / (double)count;
      double result1 = total / count;
      System.out.println("1번 : " + (result1 * 10000));
      
      int result2 = (int)result1;
      System.out.println("2번 : "+ (result2 * 10000));
      
      double result3 = total - ((count-1) * result2);
      System.out.println("3번 : "+ result3 * 10000")
}
}	
	
	
	
	

