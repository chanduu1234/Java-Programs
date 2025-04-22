package java_project_pack1;

class A {
	static int i;
	int j;

	public  void m1() {
		i++;
		j++;
	}
}

public class Satic {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		a1.m1();
		a2.m1();
		a3.m1();
		
	System.out.println(a1.i+" "+a1.j);
	System.out.println(a2.i+" "+a2.j);
	System.out.println(a3.i+" "+a3.j);

		
	}
}
