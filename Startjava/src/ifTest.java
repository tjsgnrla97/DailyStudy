
public class ifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//80점이상 A, 80미만 60점 이상 B, 60점 미만 C
		int score = 60;
		if(score >= 80) {
			System.out.println("A");
		}else if(score < 80 && score >=60) {
			System.out.println("B");
		}else if(score < 60){
			System.out.println("C");
		}
		//else가 아닌 else if는 조건문을 한번은 더 실행하므로 조금 비효율적이게 됨
		//else는 앞의 조건들이 아니면 바로 실행됨
		if(score >= 80) {
			System.out.println("A");
		}else if(score >=60) {
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		//이게 좀 더 효율적인 코드임
		//switch(expr1) expr1은 반드시 정수형(int,byte,short,char)여야함
		//java7부터는 String도 됨
		int number = (int)(Math.random()*6)+1;
		//Math.random() 0.0~1.0 난수
		//0<= number < 1 + 1
		//0<= number < 6 + 1
		//1~6 숫자 발생
		switch(number) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		case 4:
			System.out.println("4입니다");
			break;
		case 5:
			System.out.println("5입니다");
			break;
		default:
			System.out.println("6입니다");
		}
	}

}
