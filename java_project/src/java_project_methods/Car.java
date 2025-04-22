package java_project_methods;

public class Car {
	String name;
	int carnum;
	String colour;

public void addcar(String n,int num,String c) {
	name =n;
	carnum =num;
	colour=c;
}
public void display() {
	System.out.println(name+" \n"+ carnum+" \n"+colour);
}
}
