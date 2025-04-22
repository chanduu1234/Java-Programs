package java_project_blocks;
class D {
	int i;
	int j;
	
	public void display() {
		System.out.println("i :"+i);
		System.out.println("j :"+j);
	}
}

public class Demo1 {
	public static D m1() {
		return new  D();
	}
	public static void main(String[] args) {
		
		D d1 =m1();
		d1.i=10;
		d1.j=20;
		d1.display();
		D d2 =m1();
		d2.display();
	}

}
