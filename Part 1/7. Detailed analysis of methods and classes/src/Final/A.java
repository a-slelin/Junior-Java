package Final;

class A {
    final int value1 = 8;

    private final B value2;

    A(B value2) {
        this.value2 = value2;
    }

    static void myMethod(final int value, final B myClass){
        //++value;
        //value = 3;

        //myClass = new MyClass(3, "dkf");
        myClass.setIntValue(10);
    }

    public static void main(String[] args) {
        myMethod(5, new B(5, "something"));
        final B myClass;

        myClass = new B(5, "something2");
        //myClass = new MyClass(6, "dkf");
        myClass.setIntValue(6);
    }
}
