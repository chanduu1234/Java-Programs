package java_project_blocks;

public class A {
    int i;
	int j;
	{
		i=10;
		j=20;
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(A.i);
		A a1=new A();
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println("main ends");
		
	}
	{
		i=30;
		j =40;
	}
	{
		i=50;
		j=i;
	}

}
