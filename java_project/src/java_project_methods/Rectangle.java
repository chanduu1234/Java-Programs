package java_project_methods;

public class Rectangle {
	int length;
	int bredth;
public void intialize(int length,int bredth){
	this.length=length;
	this.bredth=bredth;
}
public int getarea() {
	return length*bredth;
}
public void perimeter() {
	int res= 2*(length+bredth);
	System.out.println(res);
}
public void display() {
	System.out.println("length "+length);
	System.out.println("bredth "+bredth);
}
public static void main(String[] args) {
	Rectangle r1=new Rectangle();
	r1.intialize(10, 20);
	System.out.println(r1.getarea());
	r1.perimeter();
	r1.display();
}
}

