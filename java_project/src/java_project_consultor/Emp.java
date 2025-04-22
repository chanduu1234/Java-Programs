package java_project_consultor;

public class Emp {
	String name;
	int age;
	int id;
	long mobilenum;
	
	Emp(){
		
	}
    Emp(String name){
    	
		this.name =name;
	}
    Emp(String name,int age){
		this(name);
		this.age =age;
	}
    Emp(String name,int age,int id){
    	this(name,age);
		this.id =id;
	}
    public Emp(String name,int age,int id,long mobilenum){
    	this(name,age,id);
		this.mobilenum=mobilenum;
	}
    public void display() {
    	System.out.println("emp name: "+name);
    	System.out.println("emp age: "+age);
    	System.out.println("emp id: "+id);
    	System.out.println("emp mobilenum: "+mobilenum);
    	
    }
    
	

}
