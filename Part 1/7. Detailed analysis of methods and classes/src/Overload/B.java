package Overload;

public class B {
    private int a;
    private String b;
    private boolean c;

    B(){
        a = 0;
        b = "";
        c = false;
    }

    B(int a){
        this.a = a;
        b = "";
        c = false;
    }

    B(String b){
        a = 0;
        this.b = new String(b);
        c = false;
    }

    B(boolean c){
        a = 0;
        b = "";
        this.c = c;
    }

    public B(int a, String b, boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
