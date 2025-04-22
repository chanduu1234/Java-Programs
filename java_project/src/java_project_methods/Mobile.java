package java_project_methods;

public class Mobile {
	
	String name;
	int ram;
	int rom;
	String colour;
	
public void display() {
	System.out.println(name+"\n"+ram+"\n"+rom+"\n"+colour);
}
public void addmobile(String name,int ram,int rom, String colour) {
	this.name=name;
	this.ram=ram;
	this.rom=rom;
	this.colour=colour;
}
}



