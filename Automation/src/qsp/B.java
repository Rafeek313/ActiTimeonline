package qsp;

public class B {
	public static void main(String[] args) {
		A a=new A(10);
		int x = a.getvalue();
		System.out.println(x);
		a.setvalue(30);
		System.out.println(a.getvalue());
	}

}
