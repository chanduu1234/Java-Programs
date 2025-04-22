package java_project_consultor;

public class This{
	 This(){
		 this(10,20);
		 System.out.println("this()--cons");
	 }
	 This(int i){
		 this();
		 System.out.println("this(int i)--cons" + i);
	 }
	 This(int i,int j){
		 System.out.println("this(int i,int j)--cons" + i + "," +j);
	 }
	 
	 

}
