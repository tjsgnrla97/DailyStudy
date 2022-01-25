import java.util.Scanner;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr; arr=null;
		//배열 선언 및 생성
		int[] arr = new int[4];
		for(int i=0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		//forEach 구문 사용
		//for( type 변수명 : 배열){
		for(int a : arr) {
			System.out.println(a);
		}
		
		//배열 선언 및 생성 할당;
		//new int[]{1,2,3,4,5} new int[] 생략됨
		int[] su = {1,2,3,4,5};
		for(int s:su) {
			System.out.println(s);
		}
		//아래와 같은 방법은 불가능
		//int[] su;
		//su = {1,2,3,4,5}
		//아래는 가능
		//int[] su;
		//su = new int[]{1,2,3,4,5}
	}
}
