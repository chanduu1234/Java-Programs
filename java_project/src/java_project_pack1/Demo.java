package java_project_pack1;

public class Demo {
    String name;
    int age;
    int id;
    long phonenum;
    public static void main(String[]args) {
    	
    	Demo d1=new Demo();
    	d1.name = "chandu";
    	d1.age =21;
    	d1.id = 12;
    	d1.phonenum = 9908133058l;
    	Demo d2=new Demo();
    	d2.name = "pspk";
    	d2.age =21;
    	d2.id = 12;
    	d2.phonenum = 99081330585l;
   	    System.out.println(d1.name+"  "+d1.age+"  "+d1.id+"  "+ d1.phonenum+"   " );
   	    System.out.println(d2.name+"  "+d2.age+"  "+d2.id+"  "+ d2.phonenum+"   " );
    }
}
