package java_project_consultor;

public class B {
	static int count=0;
     B(int i){
    	 System.out.println("B(int i): "+i);
    	 count++;
     }
     public static void main(String[] args) {
		new B(10);
		new B(20/10);
		new B(30%10);
		new B(40*10);
		new B(50+10);
		System.out.println(B.count);
		
	}
}
