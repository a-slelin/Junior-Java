package InstanceOf;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        out.println("For a:");
        out.println(a instanceof A);
        //out.println(a instanceof B);
        out.println(a instanceof C);
        out.println(a instanceof D);

        out.println("For b:");
        //out.println(b instanceof A);
        out.println(b instanceof B);
        //out.println(b instanceof C);
        //out.println(b instanceof D);

        out.println("For c:");
        out.println(c instanceof A);
        //out.println(c instanceof B);
        out.println(c instanceof C);
        //out.println(c instanceof D);

        out.println("For d:");
        out.println(d instanceof A);
        //out.println(d instanceof B);
        //out.println(d instanceof C);
        out.println(d instanceof D);

        out.println();
        A ob = c;
        out.println(ob instanceof A);
        //out.println(ob instanceof B);
        out.println(ob instanceof C);
        out.println(ob instanceof D);

        out.println();
        ob = d;
        out.println(ob instanceof A);
        //out.println(ob instanceof B);
        out.println(ob instanceof C);
        out.println(ob instanceof D);

        out.println();
        out.println(a instanceof Object);
        out.println(b instanceof Object);
        out.println(c instanceof Object);
        out.println(d instanceof Object);

    }
}
