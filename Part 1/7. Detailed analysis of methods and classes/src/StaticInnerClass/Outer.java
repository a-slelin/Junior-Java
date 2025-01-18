package StaticInnerClass;

class Outer {
    private int value;

    static class Inner {
        int value;

        public void myMethod(){
            System.out.println(value);
        }
    }

}
