package java_project_consultor;

public class Car {
	String colour;
	static int n=1000;
	int num;
	Car(String c){
		colour=c;
		num=n;
		n++;
}
public static void main(String[] args) {
		
		Car c1= new Car("blue");
		Car c2= new Car("black");
		Car c3= new Car("red");
		
		c2.num=1973;
		
		System.out.println(c1.colour+" \t"+ c1.num);
		System.out.println(c2.colour+" \t"+ c2.num);
		System.out.println(c3.colour+" \t"+ c3.num);
		
	}

}
