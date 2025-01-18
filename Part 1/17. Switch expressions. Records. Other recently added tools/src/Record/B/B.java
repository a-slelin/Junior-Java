package Record.B;

public class B {
    public static A functionA(String data){
        //...working
        return new A("OK", 10_10_01_01);
    }

    public static A functionB(String data){
        //...working
        return new A("ERROR", 11_11_00_00);
    }

    public static void FunMesPrint(A result){
        System.out.println("Current function is finished!");
        System.out.println("Status is " + result.status());
        System.out.println("Code is " + result.code());
        System.out.println();
    }

    public static void main(String[] args) {
        FunMesPrint(functionA("someData"));
        FunMesPrint(functionB("otherData"));
    }
}
