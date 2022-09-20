package Programs;

public class Staticvar {

	// static variable with static method and non static method
	public static int a=20;
	
		public void m2()
		{
			System.out.println(a);
		}
		
		public static void m3()
		{
			System.out.println(a);
		}
		
		public static void main(String[] args) {
			System.out.println(a);
			Staticvar obj = new Staticvar();
			obj.m2();
			m3();
	}

}
