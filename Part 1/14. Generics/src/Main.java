public class Main {
    public static void main(String[] args){
        //Object
        BadClass iob = new BadClass(47);
        BadClass strob = new BadClass("Test string");

        int tmp = (Integer)iob.getOb();
        String tmp2 = (String)strob.getOb();
        System.out.println(tmp);
        System.out.println(tmp2);
        iob.showType();
        strob.showType();

        iob = strob;//very bad

        //Generics
        SomeClass<Integer> value = new SomeClass<>(47);
        value.showType();

        SomeClass<String> value2 = new SomeClass<>("Test string.");
        System.out.println(value2.getOb().equals("Test string."));
        value2.showType();

        //value = value2; Error, and it is cool
    }
}
