package com_jsp_oops_obj;

public class Emp {
    String name;
    int age;
    static String cmpname;
    double sal;

    public static void main(String[] args) {
        Emp.cmpname = "janasena";

        Emp e1 = new Emp();
        e1.name = "PSPK";
        e1.age = 44;
        e1.sal = 1000000;

        Emp e2 = new Emp();
        e2.name = "kcs";
        e2.age = 22;
        e2.sal = 10000;

        System.out.println(e1.name + "\n" + e1.age + "\n" + Emp.cmpname + "\n" + e1.sal);
        System.out.println(e2.name + "\n" + e2.age + "\n" + Emp.cmpname +"\n" +  e2.sal);
    }
}
