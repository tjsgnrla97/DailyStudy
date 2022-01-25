package exception;

public class SimpleException {
	//try{ 예외가 발생할 수 있는 코드
	//catch(XXException e){ 던진 예외를 받음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {10};
		try {
			System.out.println(intArray[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.printf("예외가 발생했지만 처리함: 배열 크기 확인 필요 :%s%n", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료합니다.");
	}
}
