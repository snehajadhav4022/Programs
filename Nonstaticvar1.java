package Programs;

public class Nonstaticvar1 {
   //To call non static variable inside static method object creation is required
	public int a=60;
	public static void main(String[] args) {
		Nonstaticvar1 obj1 = new Nonstaticvar1();
		System.out.println(obj1.a);
		
		Nonstaticvar1 obj2 = new Nonstaticvar1();
		obj2.a=100;
		System.out.println(obj2.a);
		System.out.println(obj1.a);

	}

}
