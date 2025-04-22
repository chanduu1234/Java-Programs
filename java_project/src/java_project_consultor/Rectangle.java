package java_project_consultor;

public class Rectangle {
	int length;
	int bredth;
public Rectangle(int length,int bredth) {
	this.length=length;
	this.bredth=bredth;
}
public void display() {
	System.out.println("length: "+length);
	System.out.println("bredth: "+bredth);
}
public static void main(String[] args) {
	Rectangle r1=new Rectangle(20,10);
	Rectangle r2=new Rectangle(30,40);
	r1.display();
	r2.display();
}

}
