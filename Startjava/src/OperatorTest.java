
public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비트 반전
		int i = 4;
		System.out.println(~i);
		
		//비트 이동
		int num = -1;
		//비트를 좌로 2칸 이동
		System.out.println(num << 2); 
		//비트를 우로 2칸 이동(부호 비트 유지)
		System.out.println(num >> 2); 
		//비트를 우로 2칸 이동(부호 비트 유지x 무조건 0으로 채움)
		System.out.println(num >>> 2);
		
		int number = 10;
		//++number
		//number++
		if(number<10 & number++>5) { //&은 뒤에도 실행을 함
			System.out.println(number);
		}
		System.out.println(number);
		
		if(number<10 && number++>5) { //&&은 앞에가 false면 뒤 실행안함
			System.out.println(number);
		}
		System.out.println(number);
		
		//삼항 연산자
		int a = 10;
		String b;
		if(a%2 == 1) {
			b="홀수";
		}else {
			b="짝수";
		}
		System.out.println(b);
		
		//대입받을 변수 = 조건식 ? 참일때 대입 : 거짓일때 대입
		b = a%2==1?"홀수":"짝수";
		System.out.println(b);
	}

}
