
public class TypeCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동 형변환(묵시적 형변환)
		int a = 'A';
		System.out.println(a);
		int b = 'a';
		System.out.println(b);
		
		//명시적 형변환
		int number = 260;
		byte number2 = (byte)number;
		System.out.println(number2);
		
		String str = "daejeon";
		
		System.out.println(str);
	}

}
