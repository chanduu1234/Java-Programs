package java_project_blocks;

public class Student {
	String name;
	int age;
	int id;
	
	Student(){
		
	}
	
	public Student(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public Student(Student s) {
		this.name=s.name;
		this.age=s.age;
		this.id=s.id;
	}
	public void display() {
		System.out.println(name+" "+age+" "+id);
	}
	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2 =new Student("pspk",34,1);
		Student s3 =new Student(s2);
		s1.display();
		s2.display();
		s3.display();
	}
}
