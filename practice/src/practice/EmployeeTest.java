package practice;

public class EmployeeTest {
	public static void main (String args[]) {
		B test = new B("ayo");
		A test1 = new A();
		
		System.out.println(A.getTest());
	}
}

class B {
	static String test;
	public B(){
		super();
	}
	public B(String test) {
		super();
		this.test = test;
	}
	
	public static String getTest() {
		return test + "ayo";
	}
}

class A extends B{
	public A() {
		super();
	}
}

