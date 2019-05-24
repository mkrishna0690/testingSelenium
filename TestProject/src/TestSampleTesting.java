
public class TestSampleTesting {

	public static void main(String[] args) {
		
		int a =10;
		int b =1;
		
		System.out.println("BEFORE");
		System.out.println("--A--:="+a);
		System.out.println("--B--:="+b);
		
		a =a + b;
		b = a - b;
		a = a - b;
		System.out.println("AFTER");
		System.out.println("--A--:="+a);
		System.out.println("--B--:="+b);
		
	}

}
