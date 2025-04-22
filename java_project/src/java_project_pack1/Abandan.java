package java_project_pack1;

public class Abandan {
int a =10;
public static void main(String[]args) {
	Abandan a1 =new Abandan();
	System.out.println(a1.a);
	a1.a+=30;
	System.out.println(a1.a);
	new Abandan().a+=10;
	System.out.println(new Abandan().a);
	
}


}
