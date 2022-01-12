
public class forTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		for(int i=0; i<100; i++) {
			if((i+1)%4==0)
				number += (i+1);
		}
		System.out.println(number);
		//for문만을 사용
		int total = 0;
		for (int i=4; i<=100; i+=4) {
			total += i;
		}
		System.out.println(total);
		
		//구구단 2단
		int num = 0;
		System.out.println(2+"단===");
		for(int i = 0; i<9; i++) {
			num = 2*(i+1);
			System.out.println(2+"X"+(i+1)+"="+num);
		}
		//구구단
		int num2 = 0;
		for(int i = 0; i<9; i++) {
			System.out.println((i+1)+"단===");
			for(int j = 0; j<9; j++) {
				num2 = (i+1)*(j+1);
				System.out.println((i+1)+"X"+(j+1)+"="+num2);
			}	
		}
		//x,y 자연수 20이하 3x+5y = 60 모든 해
		for(int x = 1; x<=20; x++) {
			for(int y = 1; y<=20; y++) {
				if(3*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}

}
