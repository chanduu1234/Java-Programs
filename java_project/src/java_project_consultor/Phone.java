package java_project_consultor;

class Phone{
	static int count=0;
    Phone(){
	System.out.println("phone()-cons");
	count++;
}
public class Demo {
	public static void main(String[] args) {
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		System.out.println(Phone.count);
	}
}
}


