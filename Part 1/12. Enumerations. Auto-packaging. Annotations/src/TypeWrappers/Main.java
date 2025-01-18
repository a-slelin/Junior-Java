package TypeWrappers;

public class Main {
    public static void Char() {
        //Удалённые конструкторы
        //Character character = new Character();

        Character ch = Character.valueOf('@');
        System.out.println(ch.charValue());
    }

    public static void Bool() {
        //Удалённые констукторы
        //Boolean bool1 = new Boolean("true");
        //Boolean bool2 = new Boolean(false);

        Boolean bool = Boolean.valueOf("lsjd");
        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = Boolean.valueOf("TruE");
        Boolean bool4 = Boolean.valueOf(false);
        System.out.println(bool.booleanValue());
        System.out.println(bool2.booleanValue());
        System.out.println(bool3.booleanValue());
        System.out.println(bool4.booleanValue());

    }

    public static void  Num() {
        Double tmp = Double.valueOf(5.6);
        System.out.println(tmp.intValue());

        Integer myint = Integer.valueOf("100", 2);
        System.out.println(myint.intValue());
    }
    public static void main(String[] args) {
        Num();
    }
}
