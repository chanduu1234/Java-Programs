package java_project_blocks;

class A {
    int i;
    int j;

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void m1(C c1) { 
        System.out.println(i);
        System.out.println(j);
        System.out.println(c1.i); 
        System.out.println(c1.j);
    }
}

class C {
    int i;
    int j;

    public C(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void m1(A a1) {  
        System.out.println(i);
        System.out.println(j);
        System.out.println(a1.i); 
        System.out.println(a1.j);
    }
}

public class B { 
    public static void main(String[] args) {
        A a1 = new A (10, 20); 
        C c1 = new C (30, 40);
        
        a1.m1(c1); 
        c1.m1(a1); 
    }
}
