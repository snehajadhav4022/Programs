package Programs;

public class Localvar {

	static int a;
	int b = 20;
	
	public static void method1()
	{
		int a=80;
		System.out.println(a);
	}
	public static void main(String[] args) {
    System.out.println(a);		
    method1();
	}

}
