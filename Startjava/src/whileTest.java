
public class whileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int i = 1;
		while(i <=100) {
			if(i%5==0)
				number+=i;
			i++;
		}
		System.out.println(number);
		int number2 = 0;
		int j = 1;
		do{
			if(j%5==0)
				number2+=j;
			j++;
		}while(j <=100);
		System.out.println(number2);
		int number3 = 0;
		int k = 0;
		while(true) {
			if(++k==101) break;
			if(k%5==0) number3+=k;
		}
		System.out.println(number3);
	}

}
