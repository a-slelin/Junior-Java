package NonStaticInnerClass;

public class Outer {
    class Inner {
        private int privateValue;
        protected int protectedValue;
        int Value;
        public int publicValue;

        public Inner(int privateValue, int protectedValue, int value, int publicValue) {
            this.privateValue = privateValue;
            this.protectedValue = protectedValue;
            Value = value;
            this.publicValue = publicValue;
        }
    }

    public void myMethod(){
        class InnerMyMethod{
            private int value;

            InnerMyMethod(int value) {
                this.value = value;
            }
        }

        InnerMyMethod tmp = new InnerMyMethod(5);

        Inner tmp2 = new Inner(1, 2, 3, 4);
        System.out.println(tmp2.privateValue);
    }
}
