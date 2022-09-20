package Programs;

public class Nonstaticvar {

	//accessed only through an object
	// non static variable is same as scope of given object
	public int b = 55;
	
		public static void method1()
	{
		Nonstaticvar obj = new Nonstaticvar();
	    System.out.println(obj.b);
	}

	public void method2()
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		method1();
		Nonstaticvar obj2 = new Nonstaticvar();
		obj2.method2();
		
	}
}
